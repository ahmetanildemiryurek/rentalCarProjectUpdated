package com.rentalCarProjectUpdated.company.service.mapper;

import com.rentalCarProjectUpdated.company.domain.Company;
import com.rentalCarProjectUpdated.company.service.dto.CompanyDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CompanyMapper {
    CompanyMapper INSTANCE = Mappers.getMapper(CompanyMapper.class);

    CompanyDto toCompanyDTO(Company company);


    List<CompanyDto> toCompanyDTO(List<Company> company);

    Company toCompany(CompanyDto companyDto);
}
