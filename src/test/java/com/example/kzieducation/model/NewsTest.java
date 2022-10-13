package com.example.kzieducation.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewsTest {
    News excepted = new News("title","text","fullText");

    @Test
    void newsTest(){
        News actual = new News();
        actual.setTitle("title");
        actual.setDescription("text");
        actual.setText("fullText");


        assertEquals(excepted,actual);
    }
}
