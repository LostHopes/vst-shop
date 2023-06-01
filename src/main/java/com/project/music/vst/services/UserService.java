package com.project.music.vst.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.music.vst.dto.Users;
import com.project.music.vst.repositories.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    public void addUser()
    {
        Users user = new Users();
        user.setFirstName(user.getFirstName());
    }
    
}
