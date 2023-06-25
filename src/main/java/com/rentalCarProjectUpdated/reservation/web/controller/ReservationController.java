package com.rentalCarProjectUpdated.reservation.web.controller;

import com.rentalCarProjectUpdated.reservation.service.ReservationService;
import com.rentalCarProjectUpdated.reservation.service.dto.ReservationDto;
import com.rentalCarProjectUpdated.reservation.service.dto.ReservationInputDto;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name= "Reservation Controller")
@RequestMapping("/reservation")
@RestController
public class ReservationController {

    private final ReservationService reservationService;

    @Autowired
    public ReservationController(ReservationService reservationService){
        this.reservationService = reservationService;
    }

    @Schema(description = "Get Reservation List")
    @GetMapping("/get")
    public ResponseEntity<List<ReservationDto>> getReservationList(String clientName){
        List<ReservationDto> ReservationDtoList = this.reservationService.getReservations(clientName);
        return  new ResponseEntity<>(ReservationDtoList, HttpStatus.OK);
    }

    @Schema(description = "Insert Reservation")
    @PostMapping("/post")
    public ResponseEntity<ReservationDto>insertReservation(@RequestBody ReservationInputDto reservationInputDto){
        ReservationDto reservationDto = this.reservationService.insertReservation(reservationInputDto);
        return new ResponseEntity<>(reservationDto,HttpStatus.OK);
    }

    @Schema(description = "Delete Reservation")
    @DeleteMapping("/delete")
    public void removeReservation(Long id){
        ReservationDto reservationDto = this.reservationService.removeReservation(id);
    }

    @Schema(description = "Update Reservation")
    @PutMapping("/put")
    public ResponseEntity<ReservationDto>uptadeReservation(ReservationInputDto reservationInputDto){
        ReservationDto reservationDto = this.reservationService.updateReservation(reservationInputDto);
        return new ResponseEntity<>(reservationDto,HttpStatus.OK);
    }


}