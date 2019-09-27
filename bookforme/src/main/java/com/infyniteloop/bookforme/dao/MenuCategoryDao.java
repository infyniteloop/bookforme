package com.infyniteloop.bookforme.dao;

import java.util.List;

import com.infyniteloop.bookforme.model.MenuCategory;

public interface MenuCategoryDao {
			
	
	// Get a menu category
	MenuCategory get(long id);
	
	// get all menu categories
	List<MenuCategory> list();
		
	// add a menu category
	boolean add(MenuCategory category);
	
	// update a menu category
	boolean update(MenuCategory category);
		
	// delete a menu category
	boolean delete(MenuCategory category);
	
	

}
