package com.nhandeptrai.demo_buoi5.Controller;

import com.nhandeptrai.demo_buoi5.Entities.Role;
import com.nhandeptrai.demo_buoi5.RequestEntities.UserCreate;
import com.nhandeptrai.demo_buoi5.Services.RoleServices;
import com.nhandeptrai.demo_buoi5.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
@RequestMapping("roles")
public class RoleController {
    @Autowired
    private RoleServices roleServices;
    @Autowired
    private UserServices userServices;

    @GetMapping("")
    public String getAllRole(Model model) {
        List<Role> roles = roleServices.getAllRole();
        model.addAttribute("roles", roles);
        return "Role/getAll";
    }

    @GetMapping("/new")
    public String AddRole(Model model) {
        model.addAttribute("roles", new Role());
        return "Role/add";
    }
    @PostMapping("/save")
    public String saveRole( Role role)
    {
        roleServices.addRole(role);
        return "redirect:/roles";
    }
}
