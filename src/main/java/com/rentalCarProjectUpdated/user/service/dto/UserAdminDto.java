package com.rentalCarProjectUpdated.user.service.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor(force = true)
@Getter
@Setter
public class UserAdminDto {
    private Long id;

    private String username;

    private String password;
}
