package com.trair.portal.controller;

import com.trair.portal.controller.domain.request.AddUserRequest;
import com.trair.portal.entity.User;
import com.trair.portal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public void addUser(@RequestBody AddUserRequest request){
        System.out.println(request.getEmail());
        User user = new User(request.getUsername(), request.getPassword(), request.getEmail());
        userRepository.save(user);
    }
}
