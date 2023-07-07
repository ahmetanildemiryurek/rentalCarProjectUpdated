package com.rentalCarProjectUpdated.clientRegister.service.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper(componentModel = "spring")
@Component
public interface ClientRegisterMapper {

    ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);

    ClientRegisterDto toClientRegisterDto(ClientRegister clientRegister);

    List<ClientRegisterDto> toClientRegisterDto(List<ClientRegister> clientRegister);

    ClientRegister toClientRegister(ClientRegisterDto clientRegisterDto);
}
