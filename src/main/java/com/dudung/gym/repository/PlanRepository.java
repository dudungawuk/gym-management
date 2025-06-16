package com.dudung.gym.repository;

import com.dudung.gym.entity.Plan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanRepository extends JpaRepository<Plan, Long> {
    
}

