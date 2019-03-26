package com.cts.freelancer.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.freelancer.bean.Admin;
import com.cts.freelancer.bean.Project;
import com.cts.freelancer.service.AdminLoginService;
import com.cts.freelancer.service.ProjectService;

@Controller
@Scope("session")
public class LoginController {
	
	
	@Autowired
	AdminLoginService adminLoginService;
	
	@Autowired
	ProjectService projectService;
    
	
	  @RequestMapping(value="adminLoginAuth",method=RequestMethod.POST)
	    public ModelAndView adminAuthentication(@RequestParam("emailId") String emailId,@RequestParam("password") String password,HttpServletRequest request)
	    {
		      
		    request.getSession().setAttribute("adminId",emailId);
	    	ModelAndView modelAndView=new ModelAndView();
	    	boolean result=adminLoginService.authenticate(emailId, password);
	    	if(result)
	    	{
	    	    int adminId=adminLoginService.getadminId(emailId);
	    		modelAndView.setViewName("adminWelcome");
	    		modelAndView.addObject("user",emailId);
	    		modelAndView.addObject("adminId",adminId);
	    	}
	    	else
	    		modelAndView.setViewName("error");
	    	return modelAndView;
	    }

	  @RequestMapping("adminLoginPage")
	  public String loginAdminScreen()
	  {
		  return "adminLogin";
	  }
	  
	  @RequestMapping(value="existingProjects",method=RequestMethod.GET)
	  public ModelAndView existingProjects(@ModelAttribute Project project,HttpServletRequest request)
	  {
		  String emailId=(String)request.getSession().getAttribute("adminId");
		  System.out.println(emailId);
		  int adminId=adminLoginService.getadminId(emailId);
		  ModelAndView mv=new ModelAndView();
		  List<Project> pro=adminLoginService.getProjects(adminId);
		  System.out.println(pro.size());
		  mv.addObject("pro",pro);
		  mv.setViewName("existingProjects");
		  return mv;
	  }
	  
	@RequestMapping(value="registerProject",method=RequestMethod.GET)
	public ModelAndView registerProject(@ModelAttribute Project project){
		ModelAndView mv=new ModelAndView();
		boolean result=projectService.registerProject(project);
	
		if(result){
    		mv.addObject("name","Project"+project.getProjectName()+" added!");
    		mv.setViewName("adminWelcome");
    		
		}
		else
			mv.setViewName("error");	
		return mv;		
	}
	
    @RequestMapping(value="registerAdmin",method=RequestMethod.GET)
    public ModelAndView registerAdmin(@ModelAttribute Admin admin)
    {
    	ModelAndView modelAndView=new ModelAndView();
    	boolean result=adminLoginService.registerAdmin(admin);
    	if(result)
    	{
    		modelAndView.setViewName("adminLogin");
    		modelAndView.addObject("admin",admin);
    	}
    	else
    	modelAndView.setViewName("error");
    	return modelAndView;
    }

}
