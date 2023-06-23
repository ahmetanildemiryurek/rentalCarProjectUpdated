package com.rentalCarProjectUpdated.client.service.impl;

import com.rentalCarProjectUpdated.client.domain.Client;
import com.rentalCarProjectUpdated.client.repository.ClientRepository;
import com.rentalCarProjectUpdated.client.service.ClientService;
import com.rentalCarProjectUpdated.client.service.dto.ClientDto;
import com.rentalCarProjectUpdated.client.service.mapper.ClientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {
    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;

    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository
            , ClientMapper clientMapper){
        this.clientRepository = clientRepository;
        this.clientMapper = clientMapper;
    }
    @Override
    public List<ClientDto> getClients() {
        List<Client> clientList = this.clientRepository.findAll();
        return this.clientMapper.toUserDto(clientList);
    }

    @Override
    public ClientDto updateClient(ClientDto clientDto) {
        Client client = this.clientMapper.toUser(clientDto);
        return this.clientMapper.toUserDto(this.clientRepository.save(client));
    }

    @Override
    public ClientDto insertClient(ClientDto clientDto) {
        Client client = this.clientMapper.toUser(clientDto);
        return this.clientMapper.toUserDto(this.clientRepository.save(client));
    }

    @Override
    public ClientDto getClientDto(Long id) {
        Optional<Client> user = this.clientRepository.findById(id);
        return this.clientMapper.toUserDto(user.get());
    }

    @Override
    public Client getClient(Long id) {
        Optional<Client> user = this.clientRepository.findById(id);
        return user.get();
    }

    @Override
    public void removeClient(Long id) {
            this.clientRepository.deleteById(id);
    }
}
