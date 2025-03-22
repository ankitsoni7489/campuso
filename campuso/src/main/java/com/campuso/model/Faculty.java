package com.campuso.model;


	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;
	import org.springframework.stereotype.Service;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "faculty")
public class Faculty {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String subject;
	private String email;
	private String staffRoom;
	private String contact;
	private String timing;
	private String department;
	private int publications;
	private int experience;
	private String courses;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStaffRoom() {
		return staffRoom;
	}
	public void setStaffRoom(String staffRoom) {
		this.staffRoom = staffRoom;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getTiming() {
		return timing;
	}
	public void setTiming(String timing) {
		this.timing = timing;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getPublications() {
		return publications;
	}
	public void setPublications(int publications) {
		this.publications = publications;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getCourses() {
		return courses;
	}
	public void setCourses(String courses) {
		this.courses = courses;
	}
	public Faculty(Long id, String name, String subject, String email, String staffRoom, String contact, String timing,
			String department, int publications, int experience, String courses) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.email = email;
		this.staffRoom = staffRoom;
		this.contact = contact;
		this.timing = timing;
		this.department = department;
		this.publications = publications;
		this.experience = experience;
		this.courses = courses;
	}

	public Faculty() {
		
	}
}

