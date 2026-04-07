package com.fsadproject.ps30.service;

import com.fsadproject.ps30.entity.Career;
import com.fsadproject.ps30.repository.CareerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CareerService {

    private final CareerRepository repo;

    public CareerService(CareerRepository repo) {
        this.repo = repo;
    }

    public Career save(Career career) {
        return repo.save(career);
    }

    public List<Career> getAll() {
        return repo.findAll();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}