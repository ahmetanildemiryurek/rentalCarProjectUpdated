package com.rentalCarProjectUpdated.company.service;

import com.rentalCarProjectUpdated.company.domain.Company;
import com.rentalCarProjectUpdated.company.service.dto.CompanyDto;


import java.util.List;

public interface CompanyService {
    List<CompanyDto> getCompanies();
    CompanyDto updateCompany(CompanyDto companyDto);

    CompanyDto insertCompany(CompanyDto companyDto);

    CompanyDto getCompany(Long id);

    void removeCompany(Long id);
}
