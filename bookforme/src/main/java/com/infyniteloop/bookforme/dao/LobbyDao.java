package com.infyniteloop.bookforme.dao;

import java.util.List;

import com.infyniteloop.bookforme.model.Lobby;

public interface LobbyDao {
	
	// Get a lobby
		Lobby get(long id);
		
		// get all lobbies
		List<Lobby> list(String location);
			
		// add a lobby
		boolean add(Lobby lobby);
		
		// update a lobby
		boolean update(Lobby lobby);
			
		// delete a lobby
		boolean delete(Lobby lobby);

}
