package com.fsadproject.ps30.controller;

import com.fsadproject.ps30.entity.Result;
import com.fsadproject.ps30.service.ResultService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000") // optional but good
@RestController
@RequestMapping("/api/results")
public class ResultController {

    private final ResultService service;

    public ResultController(ResultService service) {
        this.service = service;
    }

    // ✅ POST - save result
    @PostMapping
    public Result calculate(@RequestBody Result request) {
        return service.calculateResult(
                request.getTotalScore(),
                request.getUser(),
                request.getAssessment()
        );
    }

    // 🔥 ADD THIS (THIS IS WHAT YOU WERE MISSING)
    @GetMapping
    public List<Result> getAllResults() {
        return service.getAllResults();
    }
}