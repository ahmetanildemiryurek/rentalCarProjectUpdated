package com.rentalCarProjectUpdated.companyRegister.service;

import com.rentalCarProjectUpdated.companyRegister.domain.CompanyRegister;
import com.rentalCarProjectUpdated.companyRegister.service.dto.CompanyRegisterDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CompanyRegisterService {

    List<CompanyRegisterDto> getCompanyRegisterList();


    CompanyRegisterDto insertCompanyRegister(CompanyRegisterDto companyRegisterDto);

    CompanyRegisterDto updateCompanyRegister(CompanyRegisterDto companyRegisterDto);



    CompanyRegisterDto getCompanyRegisterDto(Long id);

    CompanyRegister getCompanyRegister(Long id);

    void removeCompanyRegisterByUsernameAndPassword(String username, String password);

}
