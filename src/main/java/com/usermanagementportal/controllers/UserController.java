package com.usermanagementportal.controllers;

import com.usermanagementportal.exceptions.EmailExistException;
import com.usermanagementportal.exceptions.ExceptionHandling;
import com.usermanagementportal.exceptions.UserNotFoundException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/","/user"})
public class UserController extends ExceptionHandling {

    @GetMapping("/home")
    public String showUser() throws UserNotFoundException {
//        return "application works";

        throw new UserNotFoundException("The user name is not found!. ");
    }
}
