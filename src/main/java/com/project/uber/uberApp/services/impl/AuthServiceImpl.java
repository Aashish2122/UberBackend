package com.project.uber.uberApp.services.impl;

import com.project.uber.uberApp.dto.DriverDTO;
import com.project.uber.uberApp.dto.SignUpDTO;
import com.project.uber.uberApp.dto.UserDTO;
import com.project.uber.uberApp.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDTO signUp(SignUpDTO signUpDTO) {
        return null;
    }

    @Override
    public DriverDTO onboardNewDriver(Long userId) {
        return null;
    }
}
