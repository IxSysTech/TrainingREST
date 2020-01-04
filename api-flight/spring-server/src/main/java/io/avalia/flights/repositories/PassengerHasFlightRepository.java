package io.avalia.flights.repositories;
import io.avalia.flights.entities.PassengerHasFlightEntity;
import org.springframework.data.repository.CrudRepository;

public interface PassengerHasFlightRepository extends CrudRepository<PassengerHasFlightEntity, Long> {
}
