package com.rentalCarProjectUpdated.companyRegister.service.mapper;


import com.rentalCarProjectUpdated.companyRegister.domain.CompanyRegister;
import com.rentalCarProjectUpdated.companyRegister.service.dto.CompanyRegisterDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import java.util.List;
@Mapper(componentModel = "spring")
@Component
public interface CompanyRegisterMapper {

    CompanyRegisterMapper INSTANCE = Mappers.getMapper(CompanyRegisterMapper.class);

    CompanyRegisterDto toCompanyRegisterDto(CompanyRegister clientRegister);

    List<CompanyRegisterDto> toCompanyRegisterDto(List<CompanyRegister> companyRegisterList);

    CompanyRegister toCompanyRegister(CompanyRegisterDto companyRegisterDto);
}
