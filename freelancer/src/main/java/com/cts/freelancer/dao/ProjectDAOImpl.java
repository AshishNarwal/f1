package com.cts.freelancer.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import com.cts.freelancer.bean.Project;

@Repository("ProjectDAO")
public class ProjectDAOImpl implements ProjectDAO{

	@Autowired
	@Qualifier("sessionFactory")
	SessionFactory sessionFactory;
	
	@javax.transaction.Transactional
	public boolean registerProject(Project project) {
		Session session=null;
		session=sessionFactory.getCurrentSession();
		session.save(project);
		return true;
	}

}
