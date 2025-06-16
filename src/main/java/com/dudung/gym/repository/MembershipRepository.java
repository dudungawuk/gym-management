package com.dudung.gym.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dudung.gym.entity.Membership;

public interface MembershipRepository extends JpaRepository<Membership, Long> {
    
}

