package com.rentalCarProjectUpdated.car.service;

import com.rentalCarProjectUpdated.car.domain.Car;
import com.rentalCarProjectUpdated.car.service.dto.CarDto;

import java.util.List;

public interface CarService {

    List<CarDto> getCars();

    CarDto updateCar(CarDto carDTO);

    CarDto insertCar(CarDto carDTO);

    CarDto getCarDto(Long id);

    Car getCar(Long id);

    void removeCar(Long id);
}