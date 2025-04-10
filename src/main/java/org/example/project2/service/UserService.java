package org.example.project2.service;

import lombok.RequiredArgsConstructor;
import org.example.project2.model.User;
import org.example.project2.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
