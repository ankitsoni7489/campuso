package com.campuso.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campuso.model.Event;
import com.campuso.model.Faculty;
import com.campuso.service.FacultyService;

import ch.qos.logback.core.model.Model;

@RestController
@RequestMapping("/api")
public class FacultyController {
    private final FacultyService facultyService;

    public FacultyController(FacultyService facultyService) {
        this.facultyService = facultyService;
    }

    	@GetMapping("/faculty")
        public String getAllFaculty(Model model) {
		
//		List<Faculty> events = facultyService.getAllFaculty();
//        ((Object) model).addAttribute("events", events);
//        events.forEach(event -> System.out.println(events));
        return "faculty";    
    }
}