package com.rentalCarProjectUpdated.client.service;

import com.rentalCarProjectUpdated.client.domain.Client;
import com.rentalCarProjectUpdated.client.service.dto.ClientDto;

import java.util.List;

public interface ClientService {

    List<ClientDto> getClients();

    ClientDto updateClient(ClientDto clientDto);

    ClientDto insertClient(ClientDto clientDto);

    ClientDto getClientDto(Long id);

    Client getClient(Long id);

    void removeClient(Long id);
}