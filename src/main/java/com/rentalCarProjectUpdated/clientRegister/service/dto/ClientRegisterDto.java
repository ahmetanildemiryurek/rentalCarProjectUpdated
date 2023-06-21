package com.rentalCarProjectUpdated.clientRegister.service.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor(force = true)
@Getter
@Setter
@Data
public class ClientRegisterDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String passwordAgain;
}
