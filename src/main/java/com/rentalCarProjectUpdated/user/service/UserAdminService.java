//package com.rentalCarProjectUpdated.user.service;
//
//import com.rentalCarProjectUpdated.user.domain.UserAdmin;
//import com.rentalCarProjectUpdated.user.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserAdminService {
//    private UserRepository userRepository;
//
//    @Autowired
//    public UserAdminService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    public boolean authenticate(String email, String password) {
//        UserAdmin user = userRepository.findByUsername(password);
//        if ((user != null && user.getPassword().equals(password)) && (user != null && user.getUsername().equals(email))) {
//            return true;
//        }
//        return false;
//    }
//}
