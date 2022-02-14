package com.amatsuoka.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amatsuoka.jpa.entities.User;

public interface UserRepository  extends JpaRepository<User, Long> {

}
