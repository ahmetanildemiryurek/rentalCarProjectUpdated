package com.rentalCarProjectUpdated.rent.service.impl;

import com.rentalCarProjectUpdated.rent.domain.Rent;
import com.rentalCarProjectUpdated.rent.repository.RentRepository;
import com.rentalCarProjectUpdated.rent.service.RentService;
import com.rentalCarProjectUpdated.rent.service.dto.RentDto;
import com.rentalCarProjectUpdated.rent.service.mapper.RentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RentServiceImpl implements RentService {
    private final RentRepository rentRepository;
    private final RentMapper rentMapper;

    @Autowired
    public  RentServiceImpl(RentRepository rentRepository
            ,RentMapper rentMapper){
        this.rentRepository = rentRepository;
        this.rentMapper = rentMapper;
    }

    @Override
    public List<RentDto> getRents() {
        List<Rent> rentList = this.rentRepository.findAll();
        return this.rentMapper.toRentDto(rentList);
    }
    @Override
    public RentDto insertRent(RentDto rentDto) {
        Rent rent = this.rentMapper.toRent(rentDto);
        return this.rentMapper.toRentDto(this.rentRepository.save(rent));
    }

    @Override
    public RentDto getRentDto(Long id) {
        Optional<Rent> rent = this.rentRepository.findById(id);
        return this.rentMapper.toRentDto(rent.get());
    }

    @Override
    public Rent getRent(Long id) {
        Optional<Rent> rent = this.rentRepository.findById(id);
        return rent.get();
    }


}
