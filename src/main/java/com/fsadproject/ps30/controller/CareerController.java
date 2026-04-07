package com.fsadproject.ps30.controller;

import com.fsadproject.ps30.entity.Career;
import com.fsadproject.ps30.service.CareerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/careers")
public class CareerController {

    private final CareerService service;

    public CareerController(CareerService service) {
        this.service = service;
    }

    @PostMapping
    public Career create(@RequestBody Career career) {
        return service.save(career);
    }

    @GetMapping
    public List<Career> getAll() {
        return service.getAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}