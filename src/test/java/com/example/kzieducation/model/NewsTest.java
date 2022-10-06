package com.example.kzieducation.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewsTest {
    News excepted = new News("title","text","fullText","10/10/2022");

    @Test
    void newsTest(){
        News actual = new News();
        actual.setTitle("title");
        actual.setDescription("text");
        actual.setText("fullText");
        actual.setDate("10/10/2022");

        assertEquals(excepted,actual);
    }
}
