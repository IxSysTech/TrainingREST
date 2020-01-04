package io.avalia.flights.repositories;

import io.avalia.flights.entities.PassengerEntity;
import org.springframework.data.repository.CrudRepository;

public interface PassengerRepository extends CrudRepository<PassengerEntity, Long>{
}
