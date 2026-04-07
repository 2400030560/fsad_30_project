package com.fsadproject.ps30.service;

import com.fsadproject.ps30.entity.*;
import com.fsadproject.ps30.repository.ResultRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultService {

    private final ResultRepository repo;

    public ResultService(ResultRepository repo) {
        this.repo = repo;
    }

    public Result calculateResult(int score, User user, Assessment assessment) {

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
        result.setUser(user);
        result.setAssessment(assessment);

        return repo.save(result);
    }

    // ✅ ADD THIS METHOD (VERY IMPORTANT)
    public List<Result> getAllResults() {
        return repo.findAll();
    }
}