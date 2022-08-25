package com.example.pipelinev1.reservation;

import javax.persistence.*;

@Entity
@Table(name = "reservation_table")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "reservation_id")
    private Integer reservationId;

    @Column(name = "reservation_name")
    private String reservationName;

    public Reservation() {

    }

    public Reservation(String reservationName){
        super();
        this.reservationName = reservationName;
    }

    public Integer getReservationId() {
        return reservationId;
    }

    public void setReservationId(Integer reservationId) {
        this.reservationId = reservationId;
    }

    public String getReservationName() {
        return reservationName;
    }

    public void setReservationName(String reservationName) {
        this.reservationName = reservationName;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId=" + reservationId +
                ", reservationName='" + reservationName + '\'' +
                '}';
    }
}
