package com.campuso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campuso.model.Event;

import com.campuso.Repo.EventRepo;

@Service
public class EventService {


    private final EventRepo eventRepo;

    @Autowired  // Ensure this annotation is here
    public EventService(EventRepo eventRepo) {
        this.eventRepo = eventRepo;
    }



	
	
	
	
	
	public List<Event> getAllEvent() {
        return eventRepo.findAll();
    }
	
	
	
}
