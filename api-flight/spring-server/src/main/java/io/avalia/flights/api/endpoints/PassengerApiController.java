package io.avalia.flights.api.endpoints;

import io.avalia.flights.api.PassengerApi;
import io.avalia.flights.api.model.Passenger;
import io.avalia.flights.entities.PassengerEntity;
import io.avalia.flights.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class PassengerApiController implements PassengerApi {

    @Autowired
    PassengerRepository passengerRepository;

    private PassengerEntity toUserEntity(Passenger passenger) {
        PassengerEntity entity = new PassengerEntity();
        entity.setId(passenger.getId());
        entity.setFirstname(passenger.getFirstname());
        entity.setLastname(passenger.getLastname());

        return entity;
    }

    private Passenger toPassenger(PassengerEntity entity) {
        Passenger passenger = new Passenger();
        passenger.setId(entity.getId());
        passenger.setFirstname(entity.getFirstname());
        passenger.setLastname(entity.getLastname());

        return passenger;
    }

}
