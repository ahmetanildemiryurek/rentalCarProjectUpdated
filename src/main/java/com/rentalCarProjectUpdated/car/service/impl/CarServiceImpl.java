package com.rentalCarProjectUpdated.car.service.impl;


import com.rentalCarProjectUpdated.car.domain.Car;
import com.rentalCarProjectUpdated.car.repository.CarRepository;
import com.rentalCarProjectUpdated.car.service.CarService;
import com.rentalCarProjectUpdated.car.service.dto.CarDto;
import com.rentalCarProjectUpdated.car.service.mapper.CarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;
    private final CarMapper carMapper;

    @Autowired
    public  CarServiceImpl(CarRepository carRepository
            ,CarMapper carMapper){
        this.carRepository = carRepository;
        this.carMapper = carMapper;
    }

    @Override
    public List<CarDto> getCars() {
        List<Car> carList = this.carRepository.findAll();
        return this.carMapper.toCarDTO(carList);
    }

    @Override
    public CarDto updateCar(CarDto carDTO) {
        Car car = this.carMapper.toCar(carDTO);
        return this.carMapper.toCarDTO(this.carRepository.save(car));
    }

    @Override
    public CarDto insertCar(CarDto carDTO) {
        Car car = this.carMapper.toCar(carDTO);
        return this.carMapper.toCarDTO(this.carRepository.save(car));
    }

    @Override
    public CarDto getCarDto(Long id) {
        Optional<Car> car = this.carRepository.findById(id);

        return this.carMapper.toCarDTO(car.get());
    }

    @Override
    public Car getCar(Long id) {
        Optional<Car> car = this.carRepository.findById(id);

        return car.get();
    }

    @Override
    public void removeCar(Long id){
        this.carRepository.deleteById(id);
    }
}
