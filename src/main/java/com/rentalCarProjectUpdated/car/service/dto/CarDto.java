package com.rentalCarProjectUpdated.car.service.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@NoArgsConstructor(force = true)
@Getter
@Setter
public class CarDto implements Serializable {
    private Long id;
    private String carOwner;
    @NotNull
    @NonNull
    private String brand;
    private String model;
    private String fuelType;
    private String segment;
    private int capacity;
    private String vehicleType;
    private Boolean isActive;
    private BigDecimal amount;
    private String imgURL;
}