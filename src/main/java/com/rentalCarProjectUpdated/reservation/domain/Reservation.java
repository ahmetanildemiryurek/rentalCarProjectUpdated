package com.rentalCarProjectUpdated.reservation.domain;

import com.rentalCarProjectUpdated.car.domain.Car;
import com.rentalCarProjectUpdated.clientRegister.domain.ClientRegister;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

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

    @ManyToOne(optional = false )
    @JoinColumn(name = "CLIENT_REGISTER_ID", nullable = true)
    private ClientRegister client;

    @Column( name = "RESERVATION_START_DATE" , nullable = true  )
    private LocalDate reservationStartDate;

    @Column( name = "RESERVATION_FINISH_DATE" , nullable = true  )
    private LocalDate reservationFinishDate;

    @Column(name = "TOTALAMOUNT" , nullable = false)
    private BigDecimal totalAmount;

}