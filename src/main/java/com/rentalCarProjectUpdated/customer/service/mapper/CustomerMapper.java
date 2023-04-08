<<<<<<< HEAD
package com.rentalCarProjectUpdated.customer.service.mapper;

import com.rentalCarProjectUpdated.customer.domain.Customer;
import com.rentalCarProjectUpdated.customer.service.dto.CustomerDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDto toCustomerDTO(Customer customer);


    List<CustomerDto> toCustomerDTO(List<Customer> customer);

    Customer toCustomer(CustomerDto customerDto);
=======
package com.rentalCarProjectUpdated.customer.service.mapper;

import com.rentalCarProjectUpdated.customer.domain.Customer;
import com.rentalCarProjectUpdated.customer.service.dto.CustomerDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDto toCustomerDTO(Customer customer);


    List<CustomerDto> toCustomerDTO(List<Customer> customer);

    Customer toCustomer(CustomerDto customerDto);
>>>>>>> origin/master
}