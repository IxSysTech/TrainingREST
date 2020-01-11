package io.avalia.flights.api.endpoints;

import io.avalia.flights.api.BookingApi;
import io.avalia.flights.api.model.Booking;
import io.avalia.flights.entities.BookingEntity;
import io.avalia.flights.repositories.BookingRepository;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.Optional;
@Controller
public class BookingApiController implements BookingApi {

    @Autowired
    BookingRepository bookingRepository;

    public ResponseEntity<Object> setBooking(@ApiParam(value = "booking" ,required=true )  @Valid @RequestBody Booking booking) {
        BookingEntity bookingEntity = toBookingEntity(booking);
        bookingEntity = bookingRepository.save(bookingEntity);

        if(bookingEntity != null){
            return ResponseEntity.status(200).body("success");
        }

        return ResponseEntity.badRequest().body("Error during the creation");
    }

    public ResponseEntity<Object> deleteBookingtById(@ApiParam(value = "Booking id",required=true) @PathVariable("id") int id) {
        Optional<BookingEntity> passengerHasFlightEntity = bookingRepository.findById((long)id);
        if(passengerHasFlightEntity.isPresent()){
            bookingRepository.delete(passengerHasFlightEntity.get());
            return ResponseEntity.status(200).body("Delete succes");
        }

        return ResponseEntity.status(404).body("No passenger has flight found");
    }

    private BookingEntity toBookingEntity(Booking booking) {
        BookingEntity entity = new BookingEntity();
        entity.setId(booking.getId());
        entity.setPassengerId(booking.getPassenger());
        entity.setFlightId(booking.getFlight());
        return entity;
    }

    private Booking toBooking(BookingEntity entity) {
        Booking booking = new Booking();
        booking.setId((int)entity.getId());
        booking.setFlight((int)entity.getFlightId());
        booking.setPassenger((int)entity.getPassengerId());

        return booking;
    }
}
