package com.in28minutes.rest.webservices.restfulwebservices.Jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.rest.webservices.restfulwebservices.user.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}
