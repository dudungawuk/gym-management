package com.dudung.gym.service.impl;

import com.dudung.gym.dto.request.UserLoginRequest;
import com.dudung.gym.dto.request.UserRequest;
import com.dudung.gym.dto.response.UserResponse;
import com.dudung.gym.entity.User;
import com.dudung.gym.repository.UserRepository;
import com.dudung.gym.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public UserResponse register(UserRequest userRequest) {
        User user = new User();
        user.setName(userRequest.name());
        user.setPassword(userRequest.password());
        user.setPhone(userRequest.phone());
        user = userRepository.save(user);
        return new UserResponse(user.getId(), user.getName(), user.getPhone(), user.getRole());
    }

    @Override
    public UserResponse login(UserLoginRequest userLoginRequest) {
        User user = userRepository.findByPhone(userLoginRequest.phone());
        if (user != null && user.getPassword().equals(userLoginRequest.password())) {
            return new UserResponse(user.getId(), user.getName(), user.getPhone(), user.getRole());
        }
        return null; // or throw an exception
    }
}

