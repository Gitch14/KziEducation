package com.example.kzieducation.repo;

import com.example.kzieducation.model.User;

public class UserRepository extends CrudRepository<User,Long>{
    @Override
    Iterable<User> findAll();
}
