package com.rentalCarProjectUpdated.companyRegister.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CompanyRegister {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "FIRSTNAME" , nullable = false , length = 50)
    private String firstName;

    @Column(name = "TEL_NO", nullable = false, length = 20)
    private String telNo;

    @Column(name = "USERNAME" , nullable = false , length = 50)
    private String username;

    @Column(name = "PASSWORD" , nullable = false , length = 100)
    private String password;

    @Column(name = "PASSWORDAGAIN" , nullable = false , length = 100)
    private String passwordAgain;


}
