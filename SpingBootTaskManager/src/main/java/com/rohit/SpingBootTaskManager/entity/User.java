package com.rohit.SpingBootTaskManager.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")   //change tbale name
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;
}