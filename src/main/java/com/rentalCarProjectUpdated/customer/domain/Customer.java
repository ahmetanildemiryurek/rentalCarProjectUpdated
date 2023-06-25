package com.rentalCarProjectUpdated.customer.domain;
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

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME" , nullable = true , length = 50)
    private String name;

    @Column(name = "IDENTITYNUMBER" , nullable = true )
    private int identityNumber;

    @Column(name = "PHONENUMBER" , nullable = true )
    private int phoneNumber;

    @Column(name = "ADDRESS" , nullable = true , length = 255)
    private String address;


    @Column(name = "EMAIL" , nullable = true , length = 50)
    private String email;

}