package com.rentalCarProjectUpdated.client.service.mapper;

import com.rentalCarProjectUpdated.client.domain.Client;
import com.rentalCarProjectUpdated.client.service.dto.ClientDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring")
@Component
public interface ClientMapper {

    ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);

    ClientDto toUserDto(Client client);

    List<ClientDto> toUserDto(List<Client> client);

    Client toUser(ClientDto clientDto);


}
