package com.rentalCarProjectUpdated.reservation.service.impl;

import com.rentalCarProjectUpdated.car.domain.Car;
import com.rentalCarProjectUpdated.clientRegister.domain.ClientRegister;
import com.rentalCarProjectUpdated.customer.service.CustomerService;
import com.rentalCarProjectUpdated.reservation.domain.Reservation;
import com.rentalCarProjectUpdated.reservation.mapper.ReservationMapper;
import com.rentalCarProjectUpdated.reservation.repository.ReservationRepository;
import com.rentalCarProjectUpdated.reservation.service.ReservationService;
import com.rentalCarProjectUpdated.reservation.service.dto.ReservationDto;
import com.rentalCarProjectUpdated.reservation.service.dto.ReservationInputDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;

@SuppressWarnings("ALL")
@Service
public class ReservationServiceImpl implements ReservationService {

    private ReservationRepository reservationRepository;

    private CustomerService customerService;
    private CarService carService;
    private ReservationMapper reservationMapper;

    private ClientRegisterRepository clientRepository;


    @Autowired
    public  ReservationServiceImpl(ReservationRepository reservationRepository
            , ReservationMapper reservationMapper, CustomerService customerService, CarService carService, ClientRegisterRepository  clientRepository){
        this.reservationRepository = reservationRepository;
        this.reservationMapper = reservationMapper;
        this.customerService = customerService;
        this.carService = carService;
        this.clientRepository =clientRepository ;
    }

    @Override
    public List<ReservationDto> getReservations(String clientName) {

        ClientRegister client = clientRepository.findByUsername(clientName);
        List<Reservation> reservationList = this.reservationRepository.getReservationByClient(client);
        return this.reservationMapper.toReservationDTO(reservationList);
    }

    @Override
    public ReservationDto updateReservation(ReservationInputDto reservationDto) {
        Reservation reservation = this.reservationMapper.toReservationInput(reservationDto);
        return this.reservationMapper.toReservationDTO(this.reservationRepository.save(reservation));
    }

    @Override
    public ReservationDto insertReservation(ReservationInputDto reservationDto) {

        ClientRegister client = clientRepository.findByUsername(reservationDto.getCustomer());
        Reservation reservation =  new Reservation();
        reservation.setClient(client);
        Car car = this.carService.getCar(reservationDto.getCarId());
        reservation.setCar(car);
        LocalDate starDate = LocalDate.parse(reservationDto.getStartDate());

        LocalDate finishDate = LocalDate.parse(reservationDto.getFinishDate());

        reservation.setReservationStartDate(starDate);
        reservation.setReservationFinishDate(finishDate);
        long difDay = ChronoUnit.DAYS.between(starDate,finishDate);

        BigDecimal totalAmount = car.getAmount().multiply(new BigDecimal(difDay));

        reservation.setTotalAmount(totalAmount);
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
