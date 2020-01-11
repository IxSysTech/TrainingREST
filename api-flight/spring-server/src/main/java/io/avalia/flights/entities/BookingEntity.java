package io.avalia.flights.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Booking")
public class BookingEntity implements Serializable {
    @Id
    @Column(name = "id")
    private long id;


    @Column(name = "Passenger_id")
    private long passengerId;

    @Column(name = "Flight_id")
    private long flightId;

    public long getId() {
        return id;
    }

    public long getFlightId() {
        return flightId;
    }

    public long getPassengerId() {
        return passengerId;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFlightId(long flightId) {
        this.flightId = flightId;
    }

    public void setPassengerId(long passengerId) {
        this.passengerId = passengerId;
    }
}
