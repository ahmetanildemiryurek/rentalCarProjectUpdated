package com.rentalCarProjectUpdated.client.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "USERNAME" , nullable = false , length = 50)
    private String username;

    @Column(name = "PASSWORD" , nullable = false , length = 100)
    private String password;


}
