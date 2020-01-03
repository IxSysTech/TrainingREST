package io.avalia.flights.repositories;

import io.avalia.flights.entities.PassengerEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by Olivier Liechti on 26/07/17.
 */
public interface PassengerRepository extends CrudRepository<PassengerEntity, Long>{
}
