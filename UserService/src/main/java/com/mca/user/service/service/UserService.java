package com.mca.user.service.service;

import com.mca.user.service.entity.User;

import java.util.List;

public interface UserService {

    //create
    User saveUser(User user);

    //get all
    List<User> getAllUsers();

    //get
    User getUser(String id);

    //delete
    void deleteUser(String id);

    //update
    User updateUser(User user);

}
