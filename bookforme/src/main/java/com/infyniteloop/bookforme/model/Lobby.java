package com.infyniteloop.bookforme.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "lobby_mst")
public class Lobby {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String lobby_code;
	private String location_code;
	
	// Getter & Setters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLobby_code() {
		return lobby_code;
	}
	public void setLobby_code(String lobby_code) {
		this.lobby_code = lobby_code;
	}
	public String getLocation_code() {
		return location_code;
	}
	public void setLocation_code(String location_code) {
		this.location_code = location_code;
	}
	
	
	// to String
	@Override
	public String toString() {
		return "Lobby [id=" + id + ", lobby_code=" + lobby_code + ", location_code=" + location_code + "]";
	}
	
	
	
	
	
	
	
	
	

}
