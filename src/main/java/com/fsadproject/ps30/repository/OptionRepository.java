package com.fsadproject.ps30.repository;

import com.fsadproject.ps30.entity.Option;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OptionRepository extends JpaRepository<Option, Long> {

    // Get all options for a question
    List<Option> findByQuestionId(Long questionId);
}