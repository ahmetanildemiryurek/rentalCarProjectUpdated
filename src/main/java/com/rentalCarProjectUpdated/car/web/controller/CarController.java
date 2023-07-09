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
    @GetMapping("/getCarList")
    public ResponseEntity<List<CarDto>> getCarList(){
        List<CarDto> carDTOList = this.carService.getCarsByActive();
        return  new ResponseEntity<>(carDTOList, HttpStatus.OK);
    }

    @Schema(description = "Get Passive Car List")
    @GetMapping("/getPassiveCarList")
    public ResponseEntity<List<CarDto>> getPassiveCarList(){
        List<CarDto> carDTOList = this.carService.getCarsByPassive();
        return  new ResponseEntity<>(carDTOList, HttpStatus.OK);
    }

    @Schema(description = "Get Car")
    @GetMapping("/getCar")
    public ResponseEntity<CarDto> getCar(Long id){
        CarDto carDTO = this.carService.getCarDto(id);
        return  new ResponseEntity<>(carDTO, HttpStatus.OK);
    }

    @Schema(description = "Get Car")
    @GetMapping("/getPassiveCar")
    public ResponseEntity<CarDto> getPassiveCar(Long id){
        CarDto carDTO = this.carService.getCarDto(id);
        return  new ResponseEntity<>(carDTO, HttpStatus.OK);
    }


    @Schema(description = "Insert Car")
    @PostMapping("/postCar")
    public ResponseEntity<CarDto>insertCar(@RequestBody CarDto carDto){
        carDto = this.carService.insertCar(carDto);
        return new ResponseEntity<>(carDto,HttpStatus.OK);
    }
    @Schema(description = "Delete Car")
    @DeleteMapping("/deleteCar")
    public void removeCar(Long id){
        this.carService.removeCar(id);
    }
    @Schema(description = "Delete Passive Car")
    @DeleteMapping("/deletePassiveCar")
    public void removePassiveCar(Long id){
        this.carService.removePassiveCar(id);
    }
    @Schema(description = "Get Car List")
    @GetMapping("/getCarByBrand")
    public ResponseEntity<List<CarDto>> getCarList(@RequestParam("brand") String brand){
        List<CarDto> carDTOList = this.carService.getCarsByBrand(brand); // CarService'de markaya göre filtreleme yapılıyor
        return  new ResponseEntity<>(carDTOList, HttpStatus.OK);
    }

    @Schema(description = "Update Car")
    @PutMapping("/putCar")
    public ResponseEntity<CarDto>updateCar(@RequestBody CarDto carDto){
        carDto = this.carService.updateCar(carDto);
        return new ResponseEntity<>(carDto,HttpStatus.OK);
    }


    @Schema(description = "Passive Car")
    @GetMapping("/passiveCar")
    public ResponseEntity<CarDto>passiveCar( Long id){
        this.carService.passiveCar(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Schema(description = "Active Car")
    @GetMapping("/activeCar")
    public ResponseEntity<CarDto>activeCar( Long id){
        this.carService.activeCar(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Schema(description = "Get Active Car List")
    @GetMapping("/getActiveCarList")
    public ResponseEntity<List<CarDto>> getActiveCarList(){
        List<CarDto> carDTOList = this.carService.getCarsByPassive();
        return  new ResponseEntity<>(carDTOList, HttpStatus.OK);
    }

}

