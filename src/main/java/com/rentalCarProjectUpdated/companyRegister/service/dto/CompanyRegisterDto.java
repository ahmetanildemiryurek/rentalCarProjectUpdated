package com.rentalCarProjectUpdated.companyRegister.service.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor(force = true)
@Getter
@Setter
@Data
public class CompanyRegisterDto {
    private Long id;
    private String firstName;
    private String telNo;
    private String username;
    private String password;
    private String passwordAgain;
}
