package com.infyniteloop.bookforme.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.infyniteloop.bookforme.config.AppConfig;
import com.infyniteloop.bookforme.dao.LobbyDao;
import com.infyniteloop.bookforme.dao.LobbyDaoImpl;
import com.infyniteloop.bookforme.model.Lobby;
import com.infyniteloop.bookforme.model.Lobby;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class LobbyTestCase {

	
	
	private Lobby lobby;
	
	
	@Configuration
    static class ContextConfiguration {

        // this bean will be injected into the OrderServiceTest class
        @Bean
        public LobbyDao lobbyDao() {
        	LobbyDao lobbyDao = new LobbyDaoImpl();
            // set properties, etc.
            return lobbyDao;
        }
    }

    @Autowired
    private LobbyDao lobbyDao;
    
  
    @Test
    public void testLobbyCRUD()
    {
    	// adding 2 categories
    	lobby = new Lobby();
		lobby.setLobby_code("DLI");		
		lobby.setLocation_code("DLI");
		assertEquals("Successfully added Menu Category", true, lobbyDao.add(lobby));
		
		lobby = new Lobby();
		lobby.setLobby_code("GZB");		
		lobby.setLocation_code("DLI");	
		assertEquals("Successfully added Menu Category", true, lobbyDao.add(lobby));
		
		lobby = new Lobby();
		lobby.setLobby_code("TKD");		
		lobby.setLocation_code("DLI");	
		assertEquals("Successfully added Menu Category", true, lobbyDao.add(lobby));
		
		
		
		// fetching and updating category
		lobby = lobbyDao.get(1);
		lobby.setLobby_code("MBD");
		assertEquals("Successfully updated Menu Category", true, lobbyDao.update(lobby) );
		
		// deleteing menu category
		lobby = lobbyDao.get(2);
		assertEquals("Successfully updated Menu Category", true, lobbyDao.delete(lobby) );
		
		// fetching the list 
		assertEquals("Successfully fetched lis of Menu Category",2 , lobbyDao.list("DLI").size());
    }
    

    
    
}
