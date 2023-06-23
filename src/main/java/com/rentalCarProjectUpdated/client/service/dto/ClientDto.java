package com.rentalCarProjectUpdated.client.service.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor(force = true)
@Getter
@Setter
public class ClientDto {
    private Long id;

    private String username;

    private String password;
}
