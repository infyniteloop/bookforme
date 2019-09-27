package com.infyniteloop.bookforme.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infyniteloop.bookforme.model.MenuCategory;

@Repository("menuCategoryDao")
@Transactional
public class MenuCategoryDaoImpl implements MenuCategoryDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	// Getting single Menu category based on id
	@Override
	public MenuCategory get(long id) {
		return sessionFactory.getCurrentSession().get(MenuCategory.class, Long.valueOf(id));
	}
	
	// Get all categories
	@Override
	public List<MenuCategory> list() {
	//		String selectActiveCategory = "FROM Category WHERE active = :active";
	//		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveCategory);
	//		query.setParameter("active", true);
	//		return query.getResultList();
		
		
		String selectCategory = "FROM menu_category_mst";		
		Query query = sessionFactory.getCurrentSession().createQuery(selectCategory);
						
		return query.getResultList();
				
	}
	
	
	// adding a menu category
	@Override
	public boolean add(MenuCategory category) {
		try {
			// add the menu category to the database table
			sessionFactory.getCurrentSession().persist(category);
			return true;
			
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
	}
	
	
	
	
	@Override
	public boolean update(MenuCategory category) {
		try {
			// add the menu category to the database table
			sessionFactory.getCurrentSession().update(category);
			return true;
			
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	@Override
	public boolean delete(MenuCategory category) {
		try {
			// add the menu category to the database table
			sessionFactory.getCurrentSession().delete(category);
			return true;
			
		}catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	
	
	
	

}
