package com.fsadproject.ps30.repository;

import com.fsadproject.ps30.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {

    // Get all questions for an assessment
    List<Question> findByAssessmentId(Long assessmentId);
}