package com.rentalCarProjectUpdated.rent.service;

import com.rentalCarProjectUpdated.rent.domain.Rent;
import com.rentalCarProjectUpdated.rent.service.dto.RentDto;

import java.util.List;

public interface RentService {

    List<RentDto> getRents();

    RentDto insertRent(RentDto rentDto);

    RentDto getRentDto(Long id);

    Rent getRent(Long id);

}
