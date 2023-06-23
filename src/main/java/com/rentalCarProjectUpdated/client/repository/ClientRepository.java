package com.rentalCarProjectUpdated.client.repository;

import com.rentalCarProjectUpdated.client.domain.Client;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ClientRepository extends JpaRepository<Client, Long> ,JpaSpecificationExecutor<SecurityProperties.User>{

    Client findByUsername(String username);
    Client findByPassword(String password);
    Client findByUsernameAndPassword(String username, String password);


}

