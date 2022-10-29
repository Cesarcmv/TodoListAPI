package com.howtobeasdet.TodoListAPI.Controller;

import com.howtobeasdet.TodoListAPI.Model.User;
import com.howtobeasdet.TodoListAPI.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping(value = "/user/register")
    @ResponseStatus(HttpStatus.CREATED)
    public User register(@RequestBody User user)  {
        user.set__v(1);
        user = userRepository.save(user);
        return user;
    }

    @GetMapping(value= "/user")
    public List<User> getUsers(){
        return userRepository.findAll();
    }
}
