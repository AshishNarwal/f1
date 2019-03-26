package com.cts.freelancer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cts.freelancer.bean.Project;
import com.cts.freelancer.dao.ProjectDAO;

@Service("ProjectService")
@Transactional(propagation=Propagation.SUPPORTS)
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectDAO projectDAO;
	
	public boolean registerProject(Project project) {
		return projectDAO.registerProject(project);
	}

}
