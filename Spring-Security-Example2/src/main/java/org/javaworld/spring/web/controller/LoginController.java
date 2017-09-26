package org.javaworld.spring.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping(value = { "/", "/welcome**" }, method = RequestMethod.GET)
	public ModelAndView welcomePage(){
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Custom Login Form");
		model.addObject("message", "This is welcome page!");
		model.setViewName("hello");
		return model;
		
	}
	
	@RequestMapping(value={"/admin**"}, method=RequestMethod.GET)
	public ModelAndView homePage(){
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Custom Login Form");
		model.addObject("message", "This is protected page!");
		model.setViewName("admin");
		return model;
		
	}
	
	@RequestMapping(value={"/login"},method=RequestMethod.GET)
	public ModelAndView loginPage(@RequestParam(value ="error", required=false) String error,@RequestParam(value="logout", required=false) String logout){
		ModelAndView model =  new ModelAndView();
		
		if (error !=null){
			model.addObject("error", "Invalid Credentials");
		}
		
		if (logout != null){
			model.addObject("msg", "logged out successfully");
		}
		
		model.setViewName("login");
		return model;
		
	}

}