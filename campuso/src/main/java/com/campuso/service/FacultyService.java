package com.campuso.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.campuso.Repo.FacultyRepo;
import com.campuso.model.Faculty;

@Service
public class FacultyService {
    private final FacultyRepo facultyRepository;

    public FacultyService(FacultyRepo facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    public List<Faculty> getAllFaculty() {
        return facultyRepository.findAll();
    }
}
