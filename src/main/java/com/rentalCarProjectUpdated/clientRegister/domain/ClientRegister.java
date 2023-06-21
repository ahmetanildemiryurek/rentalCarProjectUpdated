package com.rentalCarProjectUpdated.clientRegister.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClientRegister {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "FIRSTNAME" , nullable = false , length = 50)
    private String firstName;

    @Column(name = "LASTNAME" , nullable = false , length = 50)
    private String lastName;

    @Column(name = "USERNAME" , nullable = false , length = 50)
    private String username;

    @Column(name = "PASSWORD" , nullable = false , length = 100)
    private String password;

    @Column(name = "PASSWORDAGAIN" , nullable = false , length = 100)
    private String passwordAgain;


}
