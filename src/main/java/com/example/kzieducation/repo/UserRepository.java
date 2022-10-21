package com.example.kzieducation.repo;

import com.example.kzieducation.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("select u from User u where u.surname like %?1%")
    public List<User> search(String keyword);

}