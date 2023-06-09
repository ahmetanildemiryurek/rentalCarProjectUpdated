package com.rentalCarProjectUpdated.car.domain;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity
@NamedQuery(name="Car.Active",query = "Select car from Car car where car.isActive = true")
@NamedQuery(name="Car.Passive",query = "Select car from Car car where car.isActive = false")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "CAROWNER" , nullable = false ,length = 255)
    private String carOwner;

    @Column(name = "BRAND" , nullable = false , length = 255)
    private String brand;

    @Column(name = "MODEL" , nullable = false , length = 60)
    private String model;

    @Column(name = "FUELTYPE" , nullable = false , length = 50)
    private String fuelType;

    @Column(name = "SEGMENT" , nullable = false , length = 10)
    private String segment;

    @Column(name = "CAPACITY" , nullable = false )
    private int capacity;

    @Column(name = "VEHICLETYPE" , nullable = false , length = 100)
    private String vehicleType;

    @Column(name = "ISACTIVE" , nullable = false )
    private Boolean isActive;

    @Column(name = "AMOUNT" , nullable = false )
    private BigDecimal amount;

    @Column(name = "IMGURL" , nullable = false , length = 2000)
    private String imgURL;

}
