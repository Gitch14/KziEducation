package com.example.kzieducation.model;


import lombok.*;

@AllArgsConstructor
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
    private int score;
    private int rank;
}
