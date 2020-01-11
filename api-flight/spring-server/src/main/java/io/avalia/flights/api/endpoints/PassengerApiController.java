package io.avalia.flights.api.endpoints;

import io.avalia.flights.api.PassengerApi;
import io.avalia.flights.api.model.Flight;
import io.avalia.flights.api.model.Passenger;
import io.avalia.flights.entities.FlightEntity;
import io.avalia.flights.entities.PassengerEntity;
import io.avalia.flights.repositories.PassengerRepository;
import io.swagger.annotations.ApiParam;
import org.omg.PortableInterceptor.SUCCESSFUL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.Optional;


@Controller
public class PassengerApiController implements PassengerApi {

    @Autowired
    PassengerRepository passengerRepository;

    public ResponseEntity<Object> getPassengerById(@ApiParam(value = "passenger id",required=true) @PathVariable("id") Integer id) {
        Optional<PassengerEntity> passengerEntity = passengerRepository.findById((long)id);
        if(passengerEntity.isPresent()){
            return ResponseEntity.status(200).body(toPassenger(passengerEntity.get()));
        }

        return ResponseEntity.status(404).body("No flight found");
    }

    public ResponseEntity<Object> createPassenger(@ApiParam(value = "passenger" ,required=true )  @Valid @RequestBody Passenger passenger) {
        PassengerEntity passengerEntity = toPassengerEntity(passenger);
        passengerEntity = passengerRepository.save(passengerEntity);

        if(passengerEntity != null){
            return ResponseEntity.status(200).body("success");
        }
        return ResponseEntity.badRequest().body("Error during the creation");
    }

    public ResponseEntity<Object> deletePassengerById(@ApiParam(value = "passenger id",required=true) @PathVariable("id") Integer id) {
        Optional<PassengerEntity> passengerEntity = passengerRepository.findById((long)id);
        if(passengerEntity.isPresent()){
            passengerRepository.delete(passengerEntity.get());
            return ResponseEntity.status(200).body("Delete succes");
        }

        return ResponseEntity.status(404).body("No passenger found");
    }

    public  ResponseEntity<Object> updatePassengerById(@ApiParam(value = "passenger id",required=true) @PathVariable("id") Integer id,@ApiParam(value = "" ,required=true )  @Valid @RequestBody Passenger passenger) {
        Optional<PassengerEntity> passengerEntity = passengerRepository.findById((long)id);
        if(!passengerEntity.isPresent()) {
            return ResponseEntity.status(404).body("No passenger found");
        }

        passengerEntity.get().setFirstname(passenger.getFirstname());
        passengerEntity.get().setLastname(passenger.getLastname());
        passengerRepository.save(passengerEntity.get());

        return ResponseEntity.status(200).body("Edit success");
    }

    private PassengerEntity toPassengerEntity(Passenger passenger) {
        PassengerEntity entity = new PassengerEntity();
        entity.setId(passenger.getId());
        entity.setFirstname(passenger.getFirstname());
        entity.setLastname(passenger.getLastname());

        return entity;
    }

    private Passenger toPassenger(PassengerEntity entity) {
        Passenger passenger = new Passenger();
        passenger.setId((int)entity.getId());
        passenger.setFirstname(entity.getFirstname());
        passenger.setLastname(entity.getLastname());

        return passenger;
    }

}
