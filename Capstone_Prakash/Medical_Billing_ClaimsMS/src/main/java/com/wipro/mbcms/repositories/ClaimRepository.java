package com.wipro.mbcms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.wipro.mbcms.entities.ClaimEntity;

public interface ClaimRepository extends JpaRepository<ClaimEntity, Long>{

}