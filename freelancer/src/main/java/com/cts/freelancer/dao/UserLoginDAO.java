package com.cts.freelancer.dao;

import java.util.List;

import com.cts.freelancer.bean.Project;
import com.cts.freelancer.bean.User;

public interface UserLoginDAO {

	public boolean authenticate(String emailId,String password);
	public boolean registerUser(User user);
    public User getUserSkills(String emailId);
	public List<Project> showProjects(String emailId);
}
