package com.newproject.dao;

import org.springframework.data.repository.CrudRepository;

import com.newproject.entity.User;

public interface UserRepo extends CrudRepository<User,Integer>{

}
