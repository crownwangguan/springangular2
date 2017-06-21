package com.crown.springangular.service;

import com.crown.springangular.model.User;

import java.util.List;

public interface UserService {
    User findById(long id);
    User findByName(String name);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUserById(long id);
    List<User> findAllUsers();
    void deleteAllUsers();
    boolean isUserExist(User user);
}
