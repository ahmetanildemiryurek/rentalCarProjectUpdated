package com.rentalCarProjectUpdated.user.service;

import com.rentalCarProjectUpdated.car.domain.Car;
import com.rentalCarProjectUpdated.car.service.dto.CarDto;
import com.rentalCarProjectUpdated.user.domain.UserAdmin;
import com.rentalCarProjectUpdated.user.service.dto.UserAdminDto;

import java.util.List;

public interface IUserAdminService {
    List<UserAdminDto> getUsers();

    UserAdminDto updateUser(UserAdminDto userAdminDto);

    UserAdminDto insertUser(UserAdminDto UserAdminDto);

    UserAdminDto getUserDto(Long id);

    UserAdmin getUser(Long id);

    void removeUser(Long id);
}
