package io.avalia.flights.api.endpoints;

import io.avalia.flights.api.PassengerHasFlightApi;
import io.avalia.flights.api.model.Passenger;
import io.avalia.flights.api.model.PassengerHasFlight;
import io.avalia.flights.entities.PassengerEntity;
import io.avalia.flights.entities.PassengerHasFlightEntity;
import io.avalia.flights.repositories.PassengerHasFlightRepository;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.Optional;

public class PassengerHasFlightApiController implements PassengerHasFlightApi {

    @Autowired
    PassengerHasFlightRepository passengerHasFlightRepository;

    /*public ResponseEntity<Object> setPassengerHasFlight(@ApiParam(value = "" ,required=true )  @Valid @RequestBody PassengerHasFlight passengerHasFlight) {
        PassengerHasFlightEntity passengerHasFlightEntity = toPassengerHasFlightEntity(passengerHasFlight);
        passengerHasFlightEntity = passengerHasFlightRepository.save(passengerHasFlightEntity);

        if(passengerHasFlightEntity != null){
            return ResponseEntity.status(200).body("success");
        }

        return ResponseEntity.badRequest().body("Error during the creation");
    }

    public ResponseEntity<Object> deletePassengerHasFlightById(@ApiParam(value = "PassengerHasFlight id",required=true) @PathVariable("id") Integer id) {
        Optional<PassengerHasFlightEntity> passengerHasFlightEntity = passengerHasFlightRepository.findById((long)id);
        if(passengerHasFlightEntity.isPresent()){
            passengerHasFlightRepository.delete(passengerHasFlightEntity.get());
            return ResponseEntity.status(200).body("Delete succes");
        }

        return ResponseEntity.status(404).body("No passenger has flight found");
    }*/

    private PassengerHasFlightEntity toPassengerHasFlightEntity(PassengerHasFlight passengerHasFlight) {
        PassengerHasFlightEntity entity = new PassengerHasFlightEntity();
        entity.setId(passengerHasFlight.getId());
        entity.setPassengerId(passengerHasFlight.getPassenger());
        entity.setFlightId(passengerHasFlight.getFlight());
        return entity;
    }

    private PassengerHasFlight toPassengerHasFlight(PassengerHasFlightEntity entity) {
        PassengerHasFlight passengerHasFlight = new PassengerHasFlight();
        passengerHasFlight.setId((int)entity.getId());
        passengerHasFlight.setFlight((int)entity.getFlightId());
        passengerHasFlight.setPassenger((int)entity.getPassengerId());

        return passengerHasFlight;
    }
}
