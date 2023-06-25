package com.rentalCarProjectUpdated.rent.service.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor(force = true)
@Getter
@Setter
public class RentDto {
    private Long id;
    private String carOwner;
    private String brand;
    private String model;
    private String imgURL;
    private String fuelType;
    private String capacity;
    private String amount;
}
