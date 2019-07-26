package com.zb.service;


import com.zb.dao.UserMapper;
import com.zb.entity.Role;
import com.zb.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl  implements  UserService{

    @Autowired
    UserMapper um;

    public List<User> findAll(User user){

        return  um.findAll(user);
    }
        public List<Role> findRole(){

            return um.findRole();
        }

    public int addUser(User user){

        return  um.addUser(user);

    }



}
