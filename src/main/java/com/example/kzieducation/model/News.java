package com.example.kzieducation.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "news")
@NoArgsConstructor
@Getter
@Setter
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "title", nullable = false, length = 200)
    private String title;

    @Column(name = "description", nullable = false, length = 300)
    private String description;

    @Column(name = "text", nullable = false, length = 10000)
    private String text;

    public News(String title, String description, String text) {
        this.title = title;
        this.description = description;
        this.text = text;
    }
}