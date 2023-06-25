package com.rentalCarProjectUpdated.rent.web;

import com.rentalCarProjectUpdated.rent.service.RentService;
import com.rentalCarProjectUpdated.rent.service.dto.RentDto;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name= "Rent Controller")
@RequestMapping("/rent")
@RestController
public class RentController {
    private final RentService rentService;

    @Autowired
    public RentController(RentService rentService){
        this.rentService = rentService;
    }

    @Schema(description = "Get Rent List")
    @GetMapping("/getRent")
    public ResponseEntity<List<RentDto>> getRentList(){
        List<RentDto> rentDtoList = this.rentService.getRents();
        return  new ResponseEntity<>(rentDtoList, HttpStatus.OK);
    }
    @Schema(description = "Insert Rent")
    @PostMapping("/postRent")
    public ResponseEntity<RentDto>insertRent(@RequestBody RentDto rentDto){
        rentDto = this.rentService.insertRent(rentDto);
        return new ResponseEntity<>(rentDto,HttpStatus.OK);
    }


}
