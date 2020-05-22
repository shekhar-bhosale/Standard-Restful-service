package com.practice.restwebservices.restfulwebservices.service;

import com.practice.restwebservices.restfulwebservices.model.User;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserDaoService {
    private static Map<Integer, User> users = new HashMap<>();

    private static int userCount = 3;

    static {
        users.put(1, new User(1, "Shekhar", new Date()));
        users.put(2, new User(2, "Sagar", new Date()));
        users.put(3, new User(3, "Shrikant", new Date()));
    }

    public List<User> findAll() {
        return new ArrayList<User>(users.values());
    }

    public User save(User user) {
        if (user.getId() == null) {
            user.setId(++userCount);
        }
        users.put(user.getId(), user);
        return user;
    }

    public User findOne(int id) {
        return users.get(id);
    }
}
