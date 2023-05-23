package com.wad.firstmvc.bootstrap;

import com.wad.firstmvc.domain.Role;
import com.wad.firstmvc.domain.User;
import com.wad.firstmvc.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final UserRepository userRepository;
    public DataLoader(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        PasswordEncoder bcrypt = new BCryptPasswordEncoder();
        User user1=new User("user1",bcrypt.encode("user1"));
        user1.getRoles().add(Role.ROLE_USER);
        User user2=new User("user2",bcrypt.encode("user2"));
        user2.getRoles().add(Role.ROLE_ADMIN);
        userRepository.save(user1);
        userRepository.save(user2);
    }}
