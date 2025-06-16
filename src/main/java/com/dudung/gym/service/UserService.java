package com.dudung.gym.service;

import com.dudung.gym.dto.response.UserResponse;
import com.dudung.gym.dto.request.UserLoginRequest;
import com.dudung.gym.dto.request.UserRequest;

public interface UserService {
    UserResponse register(UserRequest userRequest);
    UserResponse login(UserLoginRequest userLoginRequest);
}

