package com.usermanagementportal.service.impl;

import com.usermanagementportal.models.User;
import com.usermanagementportal.models.UserPrinciple;
import com.usermanagementportal.repository.UserRepository;
import com.usermanagementportal.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;

@Service
@Transactional
@Qualifier("userDetailsService")
public class UserServiceImpl implements UserService, UserDetailsService {
    private Logger LOGGER = LoggerFactory.getLogger(getClass());
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //This method gets called when spring tries to authenticate actual user.
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user =userRepository.findUserByUsername(username);
        if (user == null){
            LOGGER.error("User not found by username: " + username);
            throw new UsernameNotFoundException("User not found " + username);

        } else {
            user.setLastLoginDateDisplay(user.getLastLoginDate());
            user.setLastLoginDate(new Date());
            userRepository.save(user);
            UserPrinciple userPrinciple = new UserPrinciple(user);
            LOGGER.info("Returning found user by username");
            return userPrinciple;
        }

    }
}
