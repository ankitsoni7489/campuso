package com.campuso.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campuso.model.Event;

@Repository
public interface EventRepo extends JpaRepository<Event, Integer>{
	List<Event> findAll();
}
