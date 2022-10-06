package com.example.kzieducation.model;


import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class User {
    private Long id;
    private String surname;
    private String name;
    private String group;
    private String pass;
    private String role;

    public User(String surname, String name, String group, String pass, String role) {
        this.surname = surname;
        this.name = name;
        this.group = group;
        this.pass = pass;
        this.role = role;
    }
}
