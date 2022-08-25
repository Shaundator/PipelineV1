package com.example.pipelinev1.reservation;

import com.example.pipelinev1.customer.Customer;
import com.example.pipelinev1.spaceship.Spaceship;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "reservation_table")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "reservation_id")
    private Integer reservationId;

    @Column(name = "reservation_name")
    private String reservationName;

    @ManyToMany
    @JoinColumn(name = "customer_id_list_con")
    private List<Customer> customers;

    @OneToOne
    @JoinColumn(name = "reservation_spaceship_id_con")
    private Spaceship spaceship;



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
