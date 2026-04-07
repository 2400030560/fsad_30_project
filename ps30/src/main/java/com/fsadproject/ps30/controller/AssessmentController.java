package com.fsadproject.ps30.controller;

import com.fsadproject.ps30.entity.Assessment;
import com.fsadproject.ps30.service.AssessmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000") // ✅ allow React frontend
@RestController
@RequestMapping("/api/assessments")
public class AssessmentController {

    private final AssessmentService service;

    // ✅ constructor injection
    public AssessmentController(AssessmentService service) {
        this.service = service;
    }

    // ✅ Create Assessment
    @PostMapping
    public Assessment create(@RequestBody Assessment assessment) {
        return service.createAssessment(assessment);
    }

    // ✅ Get All Assessments
    @GetMapping
    public List<Assessment> getAll() {
        return service.getAll();
    }
}