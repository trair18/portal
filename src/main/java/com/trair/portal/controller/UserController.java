package com.trair.portal.controller;

import com.trair.portal.controller.domain.request.RegistrationUserRequest;
import com.trair.portal.controller.domain.request.LoginRequest;
import com.trair.portal.entity.User;
import com.trair.portal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/registration")
    public void registration(@RequestBody RegistrationUserRequest request){
        System.out.println(request.getEmail());
        User user = new User(request.getUsername(), request.getPassword(), request.getEmail());
        userRepository.save(user);
    }

    @PostMapping("/authenticate")
    public void login(@RequestBody LoginRequest request){
    }

    @GetMapping
    public List<User> findUsers(){
        return userRepository.findAll();
    }
}
