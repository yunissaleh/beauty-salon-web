package com.wad.firstmvc.services;

import com.wad.firstmvc.domain.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    List<User> users = new ArrayList(List.of(
            new User(13L, "yunis","yunis@gmail.com"),
            new User(15L, "Popa","popa@gmail.com"),
            new User(19L, "teo","teo@yahoo.com"))
    );


    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public void save(User u) {
        users.add(u);
    }
}
