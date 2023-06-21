package com.rentalCarProjectUpdated.clientRegister.service.impl;

import com.rentalCarProjectUpdated.clientRegister.domain.ClientRegister;
import com.rentalCarProjectUpdated.clientRegister.repository.ClientRegisterRepository;
import com.rentalCarProjectUpdated.clientRegister.service.ClientRegisterService;
import com.rentalCarProjectUpdated.clientRegister.service.dto.ClientRegisterDto;
import com.rentalCarProjectUpdated.clientRegister.service.mapper.ClientRegisterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientRegisterServiceImpl implements ClientRegisterService {

    private final ClientRegisterRepository clientRegisterRepository;
    private final ClientRegisterMapper clientRegisterMapper;

    @Autowired
    public ClientRegisterServiceImpl(ClientRegisterRepository clientRegisterRepository
            , ClientRegisterMapper clientRegisterMapper){
        this.clientRegisterRepository = clientRegisterRepository;
        this.clientRegisterMapper = clientRegisterMapper;
    }
    @Override
    public List<ClientRegisterDto> getClientRegisterList() {

        List<ClientRegister> clientRegisterList = this.clientRegisterRepository.findAll();
        return this.clientRegisterMapper.toClientRegisterDto(clientRegisterList);
    }

    @Override
    public ClientRegisterDto insertClientRegister(ClientRegisterDto clientRegisterDto) {
        ClientRegister clientRegister = this.clientRegisterMapper.toClientRegister(clientRegisterDto);
        return this.clientRegisterMapper.toClientRegisterDto(this.clientRegisterRepository.save(clientRegister));
    }

    @Override
    public ClientRegisterDto getClientRegisterDto(Long id) {
        Optional<ClientRegister> clientRegister = this.clientRegisterRepository.findById(id);
        return this.clientRegisterMapper.toClientRegisterDto(clientRegister.get());    }

    @Override
    public ClientRegister getClientRegister(Long id) {
        Optional<ClientRegister> clientRegister = this.clientRegisterRepository.findById(id);
        return clientRegister.get();    }
}


