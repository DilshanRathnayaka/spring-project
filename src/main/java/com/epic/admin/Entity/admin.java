package com.epic.admin.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;

    @Column(name = "admin_email", length = 45)
    private String email;

    @Column(name = "admin_name")
    private String username;

    @Column(name = "admin_role")
    private String role;

    @Column(name = "status", columnDefinition = "ENUM('ACTIVE','INACTIVE')")
    private String status;

    private String contact;
    private String address;
}
