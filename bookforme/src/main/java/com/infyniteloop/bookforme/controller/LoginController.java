package com.infyniteloop.bookforme.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	
	@RequestMapping("/login")
	public ModelAndView login()
	{
		ModelAndView mv = new ModelAndView("Login");
		mv.addObject("title", "home");
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
