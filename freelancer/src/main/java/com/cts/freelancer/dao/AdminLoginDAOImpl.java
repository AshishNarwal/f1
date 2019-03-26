package com.cts.freelancer.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cts.freelancer.bean.Admin;
import com.cts.freelancer.bean.Project;

@Repository("adminLoginDAO")

public class AdminLoginDAOImpl implements AdminLoginDAO{
	
	@Autowired
	@Qualifier("sessionFactory")
	SessionFactory sessionFactory;

	@org.springframework.transaction.annotation.Transactional(readOnly=true)
	public boolean authenticate(String emailId, String password) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		
		Query query=session.createQuery("from Admin where emailId=? and password=?");
		query.setParameter(0,emailId);
		query.setParameter(1,password);
		Admin admin=(Admin)query.getSingleResult();
		if(admin==null)
			return false;
		else
		return true;
	}

	@javax.transaction.Transactional
	public boolean registerAdmin(Admin admin) {
		// TODO Auto-generated method stub
		Session session=null;
            try{
			session=sessionFactory.getCurrentSession();
			session.save(admin);
	        return true;
            }catch(Exception e)
            {
            	System.out.println(e.getMessage()+"hello");
            	/*e.printStackTrace();*/
            	return false;
            }
	}

	@javax.transaction.Transactional
	public List<Project> getProjects(int adminId) {
		Session session=sessionFactory.getCurrentSession();
		//Query getadminid=session.createQuery("select a.adminId from Admin a where a.emailId=?");
		Query query=session.createQuery("from Project where adminId=?");
		query.setParameter(0,adminId);
		System.out.println("adminId ="+adminId);
		List<Project> projectList=query.getResultList();
		System.out.println("projectLis Length = "+projectList.size());
		for(Project p:projectList)
		{
			System.out.println(p.getAdminId());
		}
		return projectList;
	}

	@javax.transaction.Transactional
	public int getadminId(String emailId) {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Admin where emailId=?");
		query.setParameter(0,emailId);
		Admin admin=(Admin)query.getSingleResult();
		int adminId=admin.getAdminId();
		return adminId;
	}

	

	
}
