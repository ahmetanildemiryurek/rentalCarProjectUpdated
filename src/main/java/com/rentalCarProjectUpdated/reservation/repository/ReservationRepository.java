package com.rentalCarProjectUpdated.reservation.repository;

import com.rentalCarProjectUpdated.clientRegister.domain.ClientRegister;
import com.rentalCarProjectUpdated.reservation.domain.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long >, JpaSpecificationExecutor<Reservation> {

    List<Reservation> getReservationByClient(ClientRegister client);
}
