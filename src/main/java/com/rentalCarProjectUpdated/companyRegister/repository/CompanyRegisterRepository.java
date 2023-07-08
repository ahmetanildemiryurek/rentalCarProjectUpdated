package com.rentalCarProjectUpdated.companyRegister.repository;

import com.rentalCarProjectUpdated.companyRegister.domain.CompanyRegister;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CompanyRegisterRepository extends JpaRepository<CompanyRegister, Long>,JpaSpecificationExecutor<SecurityProperties.User>{

    CompanyRegister findByUsername(String username);
    CompanyRegister findByPassword(String password);
    CompanyRegister findByUsernameAndPassword(String username, String password);


}

