package com.rentalCarProjectUpdated.company.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME" , nullable = false , length = 50)
    private String companyName;

    @Column(name = "PHONENUMBER" , nullable = false )
    private int phoneNumber;

    @Column(name = "ADDRESS" , nullable = false , length = 255)
    private String address;


    @Column(name = "EMAIL" , nullable = false , length = 50)
    private String email;
}
