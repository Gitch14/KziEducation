package com.example.kzieducation.model;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class News {
    private Long id;
    private String title;
    private String description;
    private String text;
    private String date;

    public News(String title, String description, String text, String date) {
        this.title = title;
        this.description = description;
        this.text = text;
        this.date = date;
    }
}
