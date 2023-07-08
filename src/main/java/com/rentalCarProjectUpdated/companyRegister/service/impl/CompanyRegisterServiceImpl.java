package com.rentalCarProjectUpdated.companyRegister.service.impl;

import com.rentalCarProjectUpdated.companyRegister.domain.CompanyRegister;
import com.rentalCarProjectUpdated.companyRegister.repository.CompanyRegisterRepository;
import com.rentalCarProjectUpdated.companyRegister.service.CompanyRegisterService;
import com.rentalCarProjectUpdated.companyRegister.service.dto.CompanyRegisterDto;
import com.rentalCarProjectUpdated.companyRegister.service.mapper.CompanyRegisterMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyRegisterServiceImpl implements CompanyRegisterService {

    private final CompanyRegisterRepository companyRegisterRepository;
    private final CompanyRegisterMapper companyRegisterMapper;

    @Autowired
    public CompanyRegisterServiceImpl(CompanyRegisterRepository companyRegisterRepository
            , CompanyRegisterMapper companyRegisterMapper){
        this.companyRegisterRepository = companyRegisterRepository;
        this.companyRegisterMapper = companyRegisterMapper;
    }
    @Override
    public List<CompanyRegisterDto> getCompanyRegisterList() {

        List<CompanyRegister> companyRegisterList = this.companyRegisterRepository.findAll();
        return this.companyRegisterMapper.toCompanyRegisterDto(companyRegisterList);
    }

    @Override
    public CompanyRegisterDto insertCompanyRegister(CompanyRegisterDto companyRegisterDto) {
        CompanyRegister companyRegister = this.companyRegisterMapper.toCompanyRegister(companyRegisterDto);
        return this.companyRegisterMapper.toCompanyRegisterDto(this.companyRegisterRepository.save(companyRegister));
    }

    @Override
    public CompanyRegisterDto updateCompanyRegister(CompanyRegisterDto companyRegisterDto) {
        CompanyRegister companyRegister = this.companyRegisterMapper.toCompanyRegister(companyRegisterDto);
        return this.companyRegisterMapper.toCompanyRegisterDto(this.companyRegisterRepository.save(companyRegister));
    }

    @Override
    public CompanyRegisterDto getCompanyRegisterDto(Long id) {
        Optional<CompanyRegister> companyRegister = this.companyRegisterRepository.findById(id);
        return this.companyRegisterMapper.toCompanyRegisterDto(companyRegister.get());    }

    @Override
    public CompanyRegister getCompanyRegister(Long id) {
        Optional<CompanyRegister> companyRegister = this.companyRegisterRepository.findById(id);
        return companyRegister.get();    }

    @Override
    public void removeCompanyRegisterByUsernameAndPassword(String username, String password) {
        CompanyRegister companyRegister = companyRegisterRepository.findByUsernameAndPassword(username, password);
        if (companyRegister != null) {
            Long clientId = companyRegister.getId();
            companyRegisterRepository.deleteById(clientId);
        } else {
            throw new IllegalArgumentException("Kullanıcı adı veya şifre hatalı!");
        }
    }
}


