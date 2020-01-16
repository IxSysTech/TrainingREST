package io.avalia.flights.repositories;
import io.avalia.flights.entities.BookingEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BookingRepository extends PagingAndSortingRepository<BookingEntity, Long> {
}
