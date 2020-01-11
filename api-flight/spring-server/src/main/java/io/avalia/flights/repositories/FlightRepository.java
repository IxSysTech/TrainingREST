package io.avalia.flights.repositories;

import io.avalia.flights.entities.FlightEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface FlightRepository extends PagingAndSortingRepository<FlightEntity, Long> {
}
