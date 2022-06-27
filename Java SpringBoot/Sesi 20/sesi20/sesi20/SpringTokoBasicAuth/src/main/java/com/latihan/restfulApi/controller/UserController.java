package com.latihan.restfulApi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.latihan.restfulApi.repository.UserRepository;

@RestController
@RequestMapping("api/user")
public class UserController {
	private UserRepository userRepository;

    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping("/test1")
    public String test1(){
        return "API Test 1";
    }

    @GetMapping("/test2")
    public String test2(){
        return "API Test 2";
    }

    @GetMapping("")
    public <S> List<S> users(){
        return (List<S>) this.userRepository.findAll();
    }

}
