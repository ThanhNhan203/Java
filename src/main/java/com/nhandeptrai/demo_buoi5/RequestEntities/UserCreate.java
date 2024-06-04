package com.nhandeptrai.demo_buoi5.RequestEntities;

import com.nhandeptrai.demo_buoi5.Entities.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserCreate {
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String dateOfBirth;
    private Role role;
}
