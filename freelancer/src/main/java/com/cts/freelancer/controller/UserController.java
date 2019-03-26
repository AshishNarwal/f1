package com.cts.freelancer.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.freelancer.bean.Project;
import com.cts.freelancer.bean.User;
import com.cts.freelancer.service.UserLoginService;

@Controller
public class UserController {
	
	@Autowired
	UserLoginService userLogin;
	
	@RequestMapping(value="registerUser",method=RequestMethod.GET)
	public ModelAndView registerUser(@ModelAttribute User user)
	{
		ModelAndView modelAndView=new ModelAndView();
		boolean result=userLogin.registerUser(user);
		if(result)
		{
			modelAndView.setViewName("userLogin");
		}
		else
		{	
			modelAndView.setViewName("error");
		}
		return modelAndView;
	}
	
	
	@RequestMapping(value="userLoginAuth",method=RequestMethod.POST)
	public ModelAndView loginUser(@RequestParam ("emailId") String emailId,@RequestParam ("password") String password)
	{
		ModelAndView modelAndView=new ModelAndView();
		List<Project> projectList=new ArrayList<Project>(); 
		boolean result=userLogin.authenticate(emailId, password);
		if(result)
		{
			projectList=userLogin.showProjects(emailId);
			System.out.println(projectList.size());
			System.out.println(emailId);
			modelAndView.setViewName("userWelcome");
			modelAndView.addObject("emailId", emailId);
			modelAndView.addObject("projectList",projectList);
		}
		else
		{
			modelAndView.setViewName("error");
		}
		return modelAndView;
	}

}
