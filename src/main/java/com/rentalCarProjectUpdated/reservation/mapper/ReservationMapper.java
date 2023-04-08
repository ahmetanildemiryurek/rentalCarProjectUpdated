package com.rentalCarProjectUpdated.reservation.mapper;

import com.rentalCarProjectUpdated.reservation.domain.Reservation;
import com.rentalCarProjectUpdated.reservation.service.dto.ReservationDto;
import com.rentalCarProjectUpdated.reservation.service.dto.ReservationInputDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ReservationMapper {

    ReservationMapper INSTANCE = Mappers.getMapper(ReservationMapper.class);

    ReservationDto toReservationDTO(Reservation reservation);

    List<ReservationDto> toReservationDTO(List<Reservation> reservation);

    Reservation toReservation(ReservationDto reservationDto);

    Reservation toReservationInput(ReservationInputDto reservationDto);
}