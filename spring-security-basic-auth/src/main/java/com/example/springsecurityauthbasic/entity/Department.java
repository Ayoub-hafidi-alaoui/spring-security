package com.example.springsecurityauthbasic.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Department {

    @Id
    private Long id;

    private String name;
    private String manager;

}
