package com.lti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lti.entity.User;

public interface UserRepository extends JpaRepository<User, Long>
{

}
