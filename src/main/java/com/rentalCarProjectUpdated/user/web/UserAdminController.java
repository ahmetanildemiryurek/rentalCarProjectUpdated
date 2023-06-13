//package com.rentalCarProjectUpdated.user.web;
//
//import com.rentalCarProjectUpdated.car.service.CarService;
//import com.rentalCarProjectUpdated.car.service.dto.CarDto;
//import com.rentalCarProjectUpdated.user.service.IUserAdminService;
//import com.rentalCarProjectUpdated.user.service.UserAdminService;
//import com.rentalCarProjectUpdated.user.service.dto.UserAdminDto;
//import io.swagger.v3.oas.annotations.media.Schema;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//public class UserAdminController {
//    private final CarService carService;
//    private final IUserAdminService iUserAdminService;
//
//    @Autowired
//    public UserAdminController(IUserAdminService iUserAdminService){
//        this.iUserAdminService = iUserAdminService;
//    }
//
//    // CRUD İŞLEMLERİ YAPTIĞIMIZ CLASS!!
//
//    @Schema(description = "Get User List")
//    @GetMapping("/getUser")
//    public ResponseEntity<List<UserAdminDto>> getUserList(){
//        List<UserAdminDto> userAdminDtoList = this.iUserAdminService.getUsers();
//        return  new ResponseEntity<>(carDTOList, HttpStatus.OK);
//    }
//    @Schema(description = "Insert Car")
//    @PostMapping("/postCar")
//    public ResponseEntity<CarDto>insertCar(@RequestBody CarDto carDto){
//        carDto = this.carService.insertCar(carDto);
//        return new ResponseEntity<>(carDto,HttpStatus.OK);
//    }
//    @Schema(description = "Delete Car")
//    @DeleteMapping("/deleteCar")
//    public void removeCar(Long id){
//        this.carService.removeCar(id);
//    }
//
//    @Schema(description = "Update Car")
//    @PutMapping("/putCar")
//    public ResponseEntity<CarDto>updateCar(@RequestBody CarDto carDto){
//        carDto = this.carService.updateCar(carDto);
//        return new ResponseEntity<>(carDto,HttpStatus.OK);
//    }
//}
