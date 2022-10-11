package com.example.kzieducation.model;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "surname", nullable = false, length = 200)
    private String surname;

    @Column(name = "name", nullable = false, length = 200)
    private String name;

    @Column(name = "`group`", nullable = false, length = 50)
    private String group;

    @Column(name = "role", nullable = false, length = 15)
    private String role;

    @Column(name = "pass", nullable = false, length = 20)
    private String pass;

    public User(String surname, String name, String group, String role, String pass) {
        this.surname = surname;
        this.name = name;
        this.group = group;
        this.role = role;
        this.pass = pass;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

}