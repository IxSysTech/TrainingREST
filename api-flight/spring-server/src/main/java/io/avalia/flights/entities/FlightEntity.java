package io.avalia.flights.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Flight")
public class FlightEntity implements Serializable {
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "start")
    private String start;

    @Column(name = "end")
    private String end;

    @Column(name = "time")
    private String time;

    public long getId() {
        return id;
    }

    public String getEnd() {
        return end;
    }

    public String getStart() {
        return start;
    }

    public String getTime() {
        return time;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
