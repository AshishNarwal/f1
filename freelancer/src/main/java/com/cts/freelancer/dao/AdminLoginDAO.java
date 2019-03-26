package com.cts.freelancer.dao;

import java.util.List;
import com.cts.freelancer.bean.Admin;
import com.cts.freelancer.bean.Project;

public interface AdminLoginDAO {
	public boolean authenticate(String emailId,String password);
	public boolean registerAdmin(Admin admin);
	public int getadminId(String emailId);
	public List<Project> getProjects(int adminId);
}
