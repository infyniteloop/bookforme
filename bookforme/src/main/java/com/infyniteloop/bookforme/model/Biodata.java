package com.infyniteloop.bookforme.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "biodata_mst")
public class Biodata {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String guest_id;
	private String first_name;
	private String last_name;
	
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getGuest_id() {
		return guest_id;
	}
	public void setGuest_id(String guest_id) {
		this.guest_id = guest_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	
	
	@Override
	public String toString() {
		return "Biodata [id=" + id + ", guest_id=" + guest_id + ", first_name=" + first_name + ", last_name="
				+ last_name + "]";
	}
	
	
	
	
	
	
	
	
	

}
