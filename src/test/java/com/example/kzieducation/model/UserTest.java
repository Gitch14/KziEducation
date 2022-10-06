package com.example.kzieducation.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    User expected = new User("Surname","Name","group","pass","role");

    @Test
    void createHumanTest(){
        User actual = new User("Surname1","Name1","group1","pass1","role1");
        actual.setSurname("Surname");
        actual.setName("Name");
        actual.setGroup("group");
        actual.setPass("pass");
        actual.setRole("role");
        assertEquals(expected,actual);
    }
}
