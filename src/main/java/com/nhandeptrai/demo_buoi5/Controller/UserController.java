package com.nhandeptrai.demo_buoi5.Controller;


import com.nhandeptrai.demo_buoi5.RequestEntities.UserCreate;
import com.nhandeptrai.demo_buoi5.Services.RoleServices;
import com.nhandeptrai.demo_buoi5.Services.UserServices;
//import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.nhandeptrai.demo_buoi5.Entities.User;
import com.nhandeptrai.demo_buoi5.Entities.Role;
import java.util.List;

@Controller
@RequestMapping("users")
public class UserController {
    @Autowired
    private UserServices userServices;
    @Autowired
    private RoleServices roleServices;

    @GetMapping("")
    public String getAllUser(Model model) {
        List<User> users = userServices.getAllUser();
        model.addAttribute("users", users);
        return "User/getAll";
    }
    @GetMapping("/new")
    public String AddUser(Model model) {
        User user =  new User();
        List<Role> roles = roleServices.getAllRole();
        model.addAttribute("users", user);
        model.addAttribute("roles", roles);
        return "User/add";
    }
    @PostMapping("/save")
    public String saveUser(UserCreate userCreate){
        userServices.createUser(userCreate);
        return "redirect:/users";
    }
}
