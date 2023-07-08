package com.rentalCarProjectUpdated.clientRegister.repository;

import com.rentalCarProjectUpdated.clientRegister.domain.ClientRegister;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ClientRegisterRepository extends JpaRepository<ClientRegister, Long> ,JpaSpecificationExecutor<SecurityProperties.User>{

    ClientRegister findByUsername(String username);
    ClientRegister findByPassword(String password);
    ClientRegister findByUsernameAndPassword(String username, String password);


}

