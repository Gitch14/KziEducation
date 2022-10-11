package com.example.kzieducation.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
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

}