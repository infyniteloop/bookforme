package com.infyniteloop.bookforme.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.infyniteloop.bookforme.dao.MenuCategoryDao;

@Controller
public class LoginController {
	
	@Autowired
	MenuCategoryDao menuCategory;
	
	
	
	@RequestMapping("/login")
	public ModelAndView login()
	{
		ModelAndView mv = new ModelAndView("Login");
		mv.addObject("title", "home");
		mv.addObject("categories",menuCategory.list());
		return mv;
	}
	
	
	@RequestMapping("/about")
	public ModelAndView about()
	{
		ModelAndView mv = new ModelAndView("Login");
		mv.addObject("title", "about");
		return mv;
	}

}
