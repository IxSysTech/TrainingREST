package io.avalia.flights.api.endpoints;

import io.avalia.flights.api.FlightApi;
import io.avalia.flights.api.model.Flight;
import io.avalia.flights.entities.BookingEntity;
import io.avalia.flights.entities.FlightEntity;
import io.avalia.flights.entities.PassengerEntity;
import io.avalia.flights.repositories.FlightRepository;
import io.avalia.flights.repositories.PassengerRepository;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class FlightApiController implements FlightApi {
    @Autowired
    FlightRepository flightRepository;

    @Autowired
    PassengerRepository passengerRepository;

    public ResponseEntity<Object> getFlightById(@ApiParam(value = "flight id",required=true) @PathVariable("id") Integer id) {
        Optional<FlightEntity> flightEntity = flightRepository.findById((long)id);
        if(flightEntity.isPresent()){
            return ResponseEntity.status(200).body(toFlight(flightEntity.get()));
        }

        return ResponseEntity.status(404).body("No flight found");
    }

    public ResponseEntity<Object> createFlight(@ApiParam(value = "flight" ,required=true )  @Valid @RequestBody Flight flight) {
        FlightEntity flightEntity = toFlightEntity(flight);
        flightEntity = flightRepository.save(flightEntity);

        if(flightEntity != null){
            return ResponseEntity.status(200).body("success");
        }
        return ResponseEntity.badRequest().body("Error during the creation");
    }

    public ResponseEntity<Object> deleteFlightById(@ApiParam(value = "flight id",required=true) @PathVariable("id") Integer id) {
        Optional<FlightEntity> flightEntity = flightRepository.findById((long)id);
        if(flightEntity.isPresent()){
            flightRepository.delete(flightEntity.get());
            return ResponseEntity.status(200).body("Delete succes");
        }

        return ResponseEntity.status(404).body("No flight found");
    }

    public ResponseEntity<Object> updateFlightById(@ApiParam(value = "flight id",required=true) @PathVariable("id") Integer id,@ApiParam(value = "" ,required=true )  @Valid @RequestBody Flight flight) {
        Optional<FlightEntity> flightEntity = flightRepository.findById((long)id);
        if(flightEntity.isPresent()){
            flightEntity.get().setStart(flight.getStart());
            flightEntity.get().setEnd(flight.getEnd());
            flightEntity.get().setTime(flight.getTime());
            flightRepository.save(flightEntity.get());
            return ResponseEntity.status(200).body("Update succes");
        }

        return ResponseEntity.status(404).body("No flight found");
    }

    public ResponseEntity<List<Flight>> getFlights(@NotNull @ApiParam(value = "Number of the page", required = true) @Valid @RequestParam(value = "number", required = true) Integer number,@NotNull @ApiParam(value = "Size of the page", required = true) @Valid @RequestParam(value = "size", required = true) Integer size) {
        Pageable page = PageRequest.of(number, size);
        List<FlightEntity> result = flightRepository.findAll(page).getContent();
        return ResponseEntity.status(200).body(toFlightList(result));
    }

    public ResponseEntity<List<Flight>> getFlightsOfPassenger(@NotNull @ApiParam(value = "Id of the passenger", required = true) @Valid @RequestParam(value = "passenger Id", required = true) Integer passengerId) {
        Optional<PassengerEntity> passengerEntity = passengerRepository.findById((long)passengerId);
        List<FlightEntity> flights = new ArrayList<>();
        if(passengerEntity.isPresent()) {

            for (BookingEntity booking : passengerEntity.get().getBookings()) {
                flights.add(flightRepository.findById(booking.getFlightId()).get());
            }
            return ResponseEntity.status(200).body(toFlightList(flights));
        }

        return ResponseEntity.status(404).body(toFlightList(flights));
    }

    private FlightEntity toFlightEntity(Flight flight) {
        FlightEntity entity = new FlightEntity();
        entity.setId(flight.getId());
        entity.setStart(flight.getStart());
        entity.setEnd(flight.getEnd());
        entity.setTime(flight.getTime());

        return entity;
    }

    private Flight toFlight(FlightEntity entity) {
        Flight flight = new Flight();
        flight.setId((int)entity.getId());
        flight.setStart(entity.getStart());
        flight.setEnd(entity.getEnd());
        flight.setTime(entity.getTime());

        return flight;
    }

    private List<Flight> toFlightList(List<FlightEntity> list){
        List<Flight> flights = new ArrayList<>();
        for(FlightEntity flightEntity : list){
            flights.add(toFlight(flightEntity));
        }

        return flights;
    }

}