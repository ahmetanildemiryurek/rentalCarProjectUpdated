package com.rentalCarProjectUpdated.rent.service.mapper;

import com.rentalCarProjectUpdated.car.service.mapper.CarMapper;
import com.rentalCarProjectUpdated.rent.domain.Rent;
import com.rentalCarProjectUpdated.rent.service.dto.RentDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RentMapper {
    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    RentDto toRentDto(Rent rent);

    List<RentDto> toRentDto(List<Rent> rent);

    Rent toRent(RentDto rentDto);
}
