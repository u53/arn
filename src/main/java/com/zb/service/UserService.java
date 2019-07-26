package com.zb.service;

import com.zb.entity.Role;
import com.zb.entity.User;

import java.util.List;

public interface UserService {

    public List<User> findAll(User user);
    public List<Role> findRole();
    public int addUser(User user);

}
