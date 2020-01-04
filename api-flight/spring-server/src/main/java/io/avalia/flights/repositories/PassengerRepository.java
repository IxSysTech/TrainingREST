package io.avalia.flights.repositories;

import io.avalia.flights.entities.PassengerEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PassengerRepository extends CrudRepository<PassengerEntity, Long>{
}
