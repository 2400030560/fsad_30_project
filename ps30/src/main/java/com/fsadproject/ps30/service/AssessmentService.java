package com.fsadproject.ps30.service;

import com.fsadproject.ps30.entity.Assessment;
import com.fsadproject.ps30.repository.AssessmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssessmentService {

    private final AssessmentRepository repo;

    public AssessmentService(AssessmentRepository repo) {
        this.repo = repo;
    }

    public Assessment createAssessment(Assessment a) {
        return repo.save(a);
    }

    public List<Assessment> getAll() {
        return repo.findAll();
    }
}