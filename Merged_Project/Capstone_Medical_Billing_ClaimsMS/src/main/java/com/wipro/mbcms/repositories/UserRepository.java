package com.wipro.mbcms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.mbcms.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{

}