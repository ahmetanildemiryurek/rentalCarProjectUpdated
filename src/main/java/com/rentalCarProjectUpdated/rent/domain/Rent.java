package com.rentalCarProjectUpdated.rent.domain;

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
public class Rent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "CAROWNER" , nullable = true ,length = 255)
    private String carOwner;

    @Column(name = "BRAND" , nullable = true , length = 255)
    private String brand;

    @Column(name = "MODEL" , nullable = true , length = 60)
    private String model;

    @Column(name = "FUELTYPE" , nullable = true , length = 12)
    private String fuelType;

    @Column(name = "CAPACITY" , nullable = true )
    private int capacity;

    @Column(name = "AMOUNT" , nullable = true )
    private BigDecimal amount;

    @Column(name = "IMGURL" , nullable = true , length = 1000)
    private String imgURL;
}
