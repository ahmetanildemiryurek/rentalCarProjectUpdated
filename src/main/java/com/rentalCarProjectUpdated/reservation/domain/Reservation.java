package com.rentalCarProjectUpdated.reservation.domain;

import com.rentalCarProjectUpdated.car.domain.Car;
import com.rentalCarProjectUpdated.customer.domain.Customer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(optional = false )
    @JoinColumn(name = "CAR_ID", nullable = false)
    private Car car;

    @OneToOne(optional = false )
    @JoinColumn(name = "CUSTOMER_ID", nullable = false)
    private Customer customer;

    @Column( name = "RESERVATION_DATE" , nullable = false  )
    private LocalDateTime reservationDate;

    @Column(name = "TOTALAMOUNT" , nullable = false)
    private BigDecimal totalAmount;

}