package com.infyniteloop.bookforme.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infyniteloop.bookforme.model.Lobby;


@Repository("lobbyDao")
@Transactional
public class LobbyDaoImpl implements LobbyDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Lobby get(long id) {
		return sessionFactory.getCurrentSession().get(Lobby.class, Long.valueOf(id));
	}

	
	// Get all lobbies for a particular location 
	@Override
	public List<Lobby> list(String location) {
			String selectActiveCategory = "FROM lobby_mst WHERE location_code = :location";
			Query query = sessionFactory.getCurrentSession().createQuery(selectActiveCategory);
			query.setParameter("location", location);
			return query.getResultList();
		
	}

	@Override
	public boolean add(Lobby lobby) {
		try {
			// add the menu category to the database table
			sessionFactory.getCurrentSession().persist(lobby);
			return true;
			
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(Lobby lobby) {
		try {
			// add the menu category to the database table
			sessionFactory.getCurrentSession().update(lobby);
			return true;
			
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(Lobby lobby) {
		try {
			// add the menu category to the database table
			sessionFactory.getCurrentSession().delete(lobby);
			return true;
			
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

}
