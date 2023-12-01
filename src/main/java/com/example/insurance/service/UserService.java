package com.example.insurance.service;

import com.example.insurance.model.User;
import com.example.insurance.web.dto.UserRegistrarionDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrarionDto userRegistrarionDto);
}
