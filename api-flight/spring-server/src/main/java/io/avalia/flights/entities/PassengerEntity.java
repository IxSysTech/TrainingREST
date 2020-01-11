package io.avalia.flights.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "Passenger")
public class PassengerEntity implements Serializable {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "Passenger_id")
    private Set<BookingEntity> bookings;

    public long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Set<BookingEntity> getBookings() {
        return bookings;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBookings(Set<BookingEntity> bookings) {
        this.bookings = bookings;
    }
}
