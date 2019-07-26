package com.zb.controller;


import com.zb.entity.User;
import com.zb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {

    @Autowired
    UserService us;

    @RequestMapping("/list")
    public String list(Model m , User user){

        m.addAttribute("user",us.findAll(user));
        return "list";
    }

    @RequestMapping("/add")
    public String addHtml(Model m ){
        m.addAttribute("role",us.findRole());
        return "add";
    }

    @RequestMapping("/addUser")
    public String addUser(User user){

        int count = us.addUser(user);
        if(count>0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
        return "redirect:/list";
    }

}
