package com.fsadproject.ps30.service;

import com.fsadproject.ps30.entity.*;
import com.fsadproject.ps30.repository.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultService {

    private final ResultRepository repo;
    private final UserRepository userRepo;
    private final AssessmentRepository assessmentRepo;

    public ResultService(ResultRepository repo,
                         UserRepository userRepo,
                         AssessmentRepository assessmentRepo) {
        this.repo = repo;
        this.userRepo = userRepo;
        this.assessmentRepo = assessmentRepo;
    }

    public Result calculateResult(int score, User user, Assessment assessment) {

        // 🔥 GET REAL OBJECTS FROM DB
        User dbUser = userRepo.findById(user.getId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        Assessment dbAssessment = assessmentRepo.findById(assessment.getId())
                .orElseThrow(() -> new RuntimeException("Assessment not found"));

        String recommendation;

        if (score > 80)
            recommendation = "Engineering / Tech";
        else if (score > 50)
            recommendation = "Business / Management";
        else
            recommendation = "Creative Fields";

        Result result = new Result();
        result.setTotalScore(score);
        result.setRecommendation(recommendation);
        result.setUser(dbUser);              // ✅ FIX
        result.setAssessment(dbAssessment);  // ✅ FIX

        return repo.save(result);
    }

    public List<Result> getAllResults() {
        return repo.findAll();
    }
}