package com.rentalCarProjectUpdated.company.service.impl;

import com.rentalCarProjectUpdated.company.domain.Company;
import com.rentalCarProjectUpdated.company.repository.CompanyRepository;
import com.rentalCarProjectUpdated.company.service.CompanyService;
import com.rentalCarProjectUpdated.company.service.dto.CompanyDto;
import com.rentalCarProjectUpdated.company.service.mapper.CompanyMapper;
import com.rentalCarProjectUpdated.customer.domain.Customer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CompanyServiceImpl implements CompanyService {
    private CompanyRepository companyRepository;
    private CompanyMapper companyMapper;
    @Override
    public List<CompanyDto> getCompanies() {
        List<Company> companyList = this.companyRepository.findAll();
        return this.companyMapper.toCompanyDTO(companyList);

    }

    @Override
    public CompanyDto updateCompany(CompanyDto companyDto) {
        Company company= this.companyMapper.toCompany(companyDto);
        return this.companyMapper.toCompanyDTO(this.companyRepository.save(company));
    }

    @Override
    public CompanyDto insertCompany(CompanyDto companyDto) {
        Company company = this.companyMapper.toCompany(companyDto);
        return this.companyMapper.toCompanyDTO(this.companyRepository.save(company));
    }


    @Override
    public CompanyDto getCompany(Long id) {
        Optional<Company> company = this.companyRepository.findById(id);

        return this.companyMapper.toCompanyDTO(company.get());
    }

    @Override
    public void removeCompany(Long id) {
    this.companyRepository.deleteById(id);
    }
}
