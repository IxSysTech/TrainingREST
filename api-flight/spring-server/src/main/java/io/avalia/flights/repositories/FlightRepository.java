package io.avalia.flights.repositories;

import io.avalia.flights.entities.FlightEntity;
import org.springframework.data.repository.CrudRepository;

public interface FlightRepository extends CrudRepository<FlightEntity, Long> {
}
