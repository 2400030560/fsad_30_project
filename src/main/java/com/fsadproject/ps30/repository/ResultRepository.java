package com.fsadproject.ps30.repository;

import com.fsadproject.ps30.entity.Result;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResultRepository extends JpaRepository<Result, Long> {

    // Get results of a specific user
    List<Result> findByUserId(Long userId);
}