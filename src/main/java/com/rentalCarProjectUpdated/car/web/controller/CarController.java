package com.rentalCarProjectUpdated.car.web.controller;

import com.rentalCarProjectUpdated.car.service.CarService;
import com.rentalCarProjectUpdated.car.service.dto.CarDto;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name= "Car Controller")
@RequestMapping("/car")
@RestController
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService){
        this.carService = carService;
    }

    @Schema(description = "Get Car List")
    @GetMapping("/get")
    public ResponseEntity<List<CarDto>> getCarList(){
        List<CarDto> carDTOList = this.carService.getCars();
        return  new ResponseEntity<>(carDTOList, HttpStatus.OK);
    }
    @Schema(description = "Insert Car")
    @PostMapping("/post")
    public ResponseEntity<CarDto>insertCar(@RequestBody CarDto carDto){
        carDto = this.carService.insertCar(carDto);
        return new ResponseEntity<>(carDto,HttpStatus.OK);
    }
    @Schema(description = "Delete Car")
    @DeleteMapping("/delete")
    public void removeCar(Long id){
        this.carService.removeCar(id);
    }

    @Schema(description = "Update Car")
    @PutMapping("/put")
    public ResponseEntity<CarDto>updateCar(@RequestBody CarDto carDto){
        carDto = this.carService.updateCar(carDto);
        return new ResponseEntity<>(carDto,HttpStatus.OK);
    }


}
