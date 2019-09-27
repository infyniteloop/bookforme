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
import com.infyniteloop.bookforme.dao.MenuCategoryDao;
import com.infyniteloop.bookforme.dao.MenuCategoryDaoImpl;
import com.infyniteloop.bookforme.model.MenuCategory;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class MenuCategoryTestCase {
	
	private MenuCategory menuCategory;
	
	@Configuration
    static class ContextConfiguration {

        // this bean will be injected into the OrderServiceTest class
        @Bean
        public MenuCategoryDao menuCategoryDao() {
        	MenuCategoryDao menuCategoryDao = new MenuCategoryDaoImpl();
            // set properties, etc.
            return menuCategoryDao;
        }
    }

    @Autowired
    private MenuCategoryDao menuCategoryDao;
    
  
    @Test
    public void testMenuCategoryCRUD()
    {
    	// adding 2 categories
    	menuCategory = new MenuCategory();
		menuCategory.setName("Administration");		
		assertEquals("Successfully added Menu Category", true, menuCategoryDao.add(menuCategory));
		
		menuCategory = new MenuCategory();
		menuCategory.setName("Administration");		
		assertEquals("Successfully added Menu Category", true, menuCategoryDao.add(menuCategory));
		
		
		
		// fetching and updating category
		menuCategory = menuCategoryDao.get(1);
		menuCategory.setName("Biodata");
		assertEquals("Successfully updated Menu Category", true, menuCategoryDao.update(menuCategory) );
		
		// deleteing menu category
		menuCategory = menuCategoryDao.get(2);
		assertEquals("Successfully updated Menu Category", true, menuCategoryDao.delete(menuCategory) );
		
		// fetching the list 
		assertEquals("Successfully fetched lis of Menu Category",1 , menuCategoryDao.list().size());
    }
    
    
    
    
    
}
