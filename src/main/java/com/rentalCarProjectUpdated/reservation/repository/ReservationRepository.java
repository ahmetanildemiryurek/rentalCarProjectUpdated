package com.rentalCarProjectUpdated.reservation.repository;

import com.rentalCarProjectUpdated.reservation.domain.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ReservationRepository extends JpaRepository<Reservation, Long >, JpaSpecificationExecutor<Reservation> {
}
