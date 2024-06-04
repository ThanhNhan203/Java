package com.nhandeptrai.demo_buoi5.Entities;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String role_id;
    @Column(nullable = false)
    private String role_name;
    @OneToMany(mappedBy = "role")
    private List<User> users;
}
