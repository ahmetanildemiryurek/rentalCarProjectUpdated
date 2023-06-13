package com.rentalCarProjectUpdated.customer.service;

import com.rentalCarProjectUpdated.customer.domain.Customer;
import com.rentalCarProjectUpdated.customer.service.dto.CustomerDto;

import java.util.List;

public interface CustomerService {

    List<CustomerDto> getCustomers();

    CustomerDto updateCustomer(CustomerDto customerDto);

    Customer insertCustomer(CustomerDto customerDto);

    CustomerDto getCustomer(Long id);

    void removeCustomer(Long id);
}
