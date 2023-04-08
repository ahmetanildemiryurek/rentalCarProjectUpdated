package com.rentalCarProjectUpdated.reservation.service.dto;

import com.rentalCarProjectUpdated.car.service.dto.CarDto;
import com.rentalCarProjectUpdated.customer.service.dto.CustomerDto;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@NoArgsConstructor(force = true)
@Data
public class ReservationDto {
    private CarDto car;
    private CustomerDto customer;
    private Long id;
    private LocalDateTime reservationDate;
    private BigDecimal totalAmount;
}

