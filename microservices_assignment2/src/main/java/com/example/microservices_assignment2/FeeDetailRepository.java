package com.example.microservices_assignment2;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FeeDetailRepository extends JpaRepository<FeeDetail, Integer> {
}