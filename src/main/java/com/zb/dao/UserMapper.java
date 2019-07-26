package com.zb.dao;

import com.zb.entity.Role;
import com.zb.entity.User;

import java.util.List;

public interface UserMapper {

    public List<User> findAll(User user);

    public List<Role> findRole();

    public int addUser(User user);
}
