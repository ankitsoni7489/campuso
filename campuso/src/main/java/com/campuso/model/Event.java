package com.campuso.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "events")
public class Event {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int event_id;
	@Column(name = "event_name")
	private String event_name;
	@Column(name = "date")
	private String date;
	@Column(name = "dicription")
	private String dicription;
	@Column(name = "address")
	private String address;
 	@Column(name = "type")
	private String type;
	public int getEvent_id() {
		return event_id;
	}
	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}
	public String getEvent_name() {
		return event_name;
	}
	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDicription() {
		return dicription;
	}
	public void setDicription(String dicription) {
		this.dicription = dicription;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Event(int event_id, String event_name, String date, String dicription, String address, String type) {
		super();
		this.event_id = event_id;
		this.event_name = event_name;
		this.date = date;
		this.dicription = dicription;
		this.address = address;
		this.type = type;
	}
	public Event() {
    }
	
}	