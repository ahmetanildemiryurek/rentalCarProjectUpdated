package com.rentalCarProjectUpdated.reservation.service;

import com.rentalCarProjectUpdated.reservation.service.dto.ReservationDto;
import com.rentalCarProjectUpdated.reservation.service.dto.ReservationInputDto;

import java.util.List;

public interface ReservationService {
    List<ReservationDto> getReservations();

    ReservationDto updateReservation(ReservationInputDto reservationDto);

    ReservationDto insertReservation(ReservationInputDto reservationDto);

    ReservationDto getReservation(Long id);

    ReservationDto removeReservation(Long id);
}