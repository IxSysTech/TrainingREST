package io.avalia.flights.repositories;
import io.avalia.flights.entities.BookingEntity;
import org.springframework.data.repository.CrudRepository;

public interface BookingRepository extends CrudRepository<BookingEntity, Long> {
}
