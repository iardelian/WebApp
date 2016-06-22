package com.springapp.mvc.webapp.service;

import com.springapp.mvc.webapp.model.User;

import java.util.List;

public interface UserService {

    public void addUser(User user);

    public void updateUser(User user);

    public void removeUser(int id);

    public User getUserById(int id);

    public List<User> userList();
}
