package com.tu_proyecto.gestor_tareas.service;

import com.tu_proyecto.gestor_tareas.model.Role;
import com.tu_proyecto.gestor_tareas.model.User;
import com.tu_proyecto.gestor_tareas.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void register(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }
}