package com.nhandeptrai.demo_buoi5.Responsitories;

import com.nhandeptrai.demo_buoi5.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserResponsitory extends JpaRepository<User,String> {

}
