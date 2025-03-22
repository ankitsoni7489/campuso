package com.campuso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.campuso.model.Event;
import com.campuso.service.EventService;

@Controller
@RequestMapping("/api")
public class EventController {
	
	@Autowired
	private EventService eventservice;
	
	@GetMapping("/all")
    public String getAllEvent(Model model) {
		
		List<Event> events = eventservice.getAllEvent();
        model.addAttribute("events", events);
        events.forEach(event -> System.out.println(events));
        return "event";    
    }
	
	
}
