package com.softserve.itacademy;

import java.util.LinkedList;
import java.util.List;

public class UserDataAccesseObject {
    private List<User> users = new LinkedList<>();
    private static UserDataAccesseObject instance = null;

    private UserDataAccesseObject() {
    }

    public static UserDataAccesseObject getInstance(){
        if (instance == null){
            instance = new UserDataAccesseObject();
            return instance;
        }
        return instance;
    }

    public boolean create(User user) {
        if (user != null) {
            return users.add(user);
        }
        return false;
    }

    public User read(int id) {
        return users.stream().filter(user -> user.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public boolean update(int id, User user) {
        int index = users.indexOf(read(id));
        return users.set(index, user) != null;
    }

    public boolean delete(int id) {
        return users.remove(read(id));
    }

    public List<User> readAll() {
        return users;
    }
}
