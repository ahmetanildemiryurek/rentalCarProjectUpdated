package com.rentalCarProjectUpdated.clientRegister.service;

import com.rentalCarProjectUpdated.clientRegister.domain.ClientRegister;
import com.rentalCarProjectUpdated.clientRegister.service.dto.ClientRegisterDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClientRegisterService {

    List<ClientRegisterDto> getClientRegisterList();


    ClientRegisterDto insertClientRegister(ClientRegisterDto clientRegisterDto);

    ClientRegisterDto updateClientRegister(ClientRegisterDto clientRegisterDto);
    ClientRegisterDto getClientRegisterDto(Long id);

    ClientRegister getClientRegister(Long id);
    void removeClientRegisterByUsernameAndPassword(String username, String password);
}
