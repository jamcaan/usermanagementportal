package com.usermanagementportal.service;

import com.usermanagementportal.exceptions.*;
import com.usermanagementportal.models.User;
import org.springframework.web.multipart.MultipartFile;

import javax.mail.MessagingException;
import java.io.IOException;
import java.util.List;

public interface UserService {

   User register(String firstName, String lastName, String username, String email) throws UserNotFoundException, UsernameExistException, EmailExistException, MessagingException;

   List<User> getUsers();

   User findUserByUsername(String username);

   User findUserByEmail(String email);

   User addNewUser(String firstName, String lastName, String username, String email, String role, boolean isNotLocked, boolean isActive, MultipartFile profileImage) throws UserNotFoundException, UsernameExistException, EmailExistException, IOException, NotAnImageFileException;

   User updateUser(String currentUsername,String firstName, String lastName, String username, String email, String role, boolean isNotLocked, boolean isActive, MultipartFile profileImage) throws UserNotFoundException, UsernameExistException, EmailExistException, IOException, NotAnImageFileException;

   void deleteUser(String username) throws IOException;

   void resetPassword(String email) throws EmailNotFoundException, MessagingException;

   User updateProfileImage (String username, MultipartFile profileImage) throws UserNotFoundException, UsernameExistException, EmailExistException, IOException, NotAnImageFileException;


}
