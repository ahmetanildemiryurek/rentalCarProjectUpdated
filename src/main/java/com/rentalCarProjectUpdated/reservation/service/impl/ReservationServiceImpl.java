package com.rentalCarProjectUpdated.reservation.service.impl;

import com.rentalCarProjectUpdated.car.domain.Car;
import com.rentalCarProjectUpdated.car.service.CarService;
import com.rentalCarProjectUpdated.customer.domain.Customer;
import com.rentalCarProjectUpdated.customer.service.CustomerService;
import com.rentalCarProjectUpdated.reservation.domain.Reservation;
import com.rentalCarProjectUpdated.reservation.mapper.ReservationMapper;
import com.rentalCarProjectUpdated.reservation.repository.ReservationRepository;
import com.rentalCarProjectUpdated.reservation.service.ReservationService;
import com.rentalCarProjectUpdated.reservation.service.dto.ReservationDto;
import com.rentalCarProjectUpdated.reservation.service.dto.ReservationInputDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@SuppressWarnings("ALL")
@Service
public class ReservationServiceImpl implements ReservationService {

    private ReservationRepository reservationRepository;

    private CustomerService customerService;
    private CarService carService;
    private ReservationMapper reservationMapper;

    @Autowired
    public  ReservationServiceImpl(ReservationRepository reservationRepository
            , ReservationMapper reservationMapper, CustomerService customerService,CarService carService){
        this.reservationRepository = reservationRepository;
        this.reservationMapper = reservationMapper;
        this.customerService = customerService;
        this.carService = carService;
    }

    @Override
    public List<ReservationDto> getReservations() {
        List<Reservation> reservationList = this.reservationRepository.findAll();
        return this.reservationMapper.toReservationDTO(reservationList);
    }

    @Override
    public ReservationDto updateReservation(ReservationInputDto reservationDto) {
        Reservation reservation = this.reservationMapper.toReservationInput(reservationDto);
        return this.reservationMapper.toReservationDTO(this.reservationRepository.save(reservation));
    }

    @Override
    public ReservationDto insertReservation(ReservationInputDto reservationDto) {
        Reservation reservation = this.reservationMapper.toReservationInput(reservationDto);
        Car car = this.carService.getCar(reservationDto.getCarId());
        reservation.setCar(car);
        Customer customer = this.customerService.insertCustomer(reservationDto.getCustomer());
        reservation.setCustomer(customer);

        return this.reservationMapper.toReservationDTO(this.reservationRepository.save(reservation));
    }

    @Override
    public ReservationDto getReservation(Long id) {
        Optional<Reservation> reservation = this.reservationRepository.findById(id);

        return this.reservationMapper.toReservationDTO(reservation.get());
    }

    @Override
    public ReservationDto removeReservation(Long id) {
        return  null;
    }

}
