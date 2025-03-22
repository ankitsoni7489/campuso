package com.campuso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.campuso.service.HomeService;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	private HomeService homeservice;
	
	
	@RequestMapping("home")
	public String home() {
		return "home";
	}
	
	@RequestMapping("event")
	public String event()
	{
		return "event";
	}
	
	@RequestMapping("planner")
	public String planner()
	{
		return "planner";
	}
	
	@RequestMapping("facultydirectory")
	public String facultydirectory()
	{
		return "facultydirectory";
	}
	

	@RequestMapping("menu")
	public String menu()
	{
		return "menu";
	}

	@RequestMapping("links")
	public String links()
	{
		return "links";
	}

	@RequestMapping("complain")
	public String complain()
	{
		return "complain";
	}

	@RequestMapping("library")
	public String library()
	{
		return "library";
	}

	@RequestMapping("unifreelance")
	public String unifreelance()
	{
		return "unifreelance";
	}

	@RequestMapping("lost")
	public String lost()
	{
		return "lost";
	}

	@RequestMapping("note")
	public String note()
	{
		return "note";
	}
}
