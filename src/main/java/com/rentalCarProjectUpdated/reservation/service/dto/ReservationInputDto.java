package com.rentalCarProjectUpdated.reservation.service.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor(force = true)
@Getter
@Setter
public class ReservationInputDto {
    private String customer;
    private Long carId;
    private String startDate;
    private String finishDate;
}
