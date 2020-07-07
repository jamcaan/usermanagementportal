package com.usermanagementportal.service;

import com.usermanagementportal.exceptions.EmailExistException;
import com.usermanagementportal.exceptions.UserNotFoundException;
import com.usermanagementportal.exceptions.UsernameExistException;
import com.usermanagementportal.models.User;

import java.util.List;

public interface UserService {

   User register(String firstName, String lastName, String username, String email) throws UserNotFoundException, UsernameExistException, EmailExistException;

   List<User> getUsers();

   User findUserByUsername(String username);

   User findUserByEmail(String email);
}
