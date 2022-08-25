package com.example.pipelinev1;

import com.example.pipelinev1.customer.Customer;
import com.example.pipelinev1.customer.CustomerRepository;
import com.example.pipelinev1.reservation.Reservation;
import com.example.pipelinev1.reservation.ReservationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class PipelineV1Application {

    private static final Logger log = LoggerFactory.getLogger(PipelineV1Application.class);

    public static void main(String[] args) {
        SpringApplication.run(PipelineV1Application.class, args);
    }
    @Bean
    public CommandLineRunner importData(
            CustomerRepository customerRepository,
            ReservationRepository reservationRepository) {

        return (args) -> {
            final List<Customer> customers = new ArrayList<>();
            customers.add(new Customer("Person1", "Last1"));
            customers.add(new Customer("Person2", "Last2"));
            customers.add(new Customer("Person3", "Last3"));
            customers.add(new Customer("Person4", "Last4"));
            customers.add(new Customer("Person5", "Last5"));
            Reservation reservation = new Reservation("TestReservation");
            for (Customer customer : customers) {
                customer.setReservation(reservation);
            }
            reservationRepository.save(reservation);
            customerRepository.saveAll(customers);
        };
    }
}
