package com.campuso.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campuso.model.Faculty;

@Repository
public interface FacultyRepo extends JpaRepository<Faculty, Long> {
}
