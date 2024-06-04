package com.nhandeptrai.demo_buoi5.Services;

import com.nhandeptrai.demo_buoi5.Entities.Role;
import com.nhandeptrai.demo_buoi5.Responsitories.RoleResponsitory;
import com.nhandeptrai.demo_buoi5.Responsitories.UserResponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServices
{
    @Autowired
    private RoleResponsitory roleResponsitory;
    public List<Role> getAllRole(){
        return roleResponsitory.findAll();
    }
    public void addRole(Role role){
        roleResponsitory.save(role);
    }
}
