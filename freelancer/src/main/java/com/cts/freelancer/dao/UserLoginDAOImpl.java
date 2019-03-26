package com.cts.freelancer.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.cts.freelancer.bean.Project;
import com.cts.freelancer.bean.User;


@Repository("userLoginDAO")
public class UserLoginDAOImpl implements UserLoginDAO{

	
	@Autowired
	@Qualifier("sessionFactory")
	SessionFactory sessionFactory;

	@Transactional
	public boolean authenticate(String emailId, String password) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from User where emailId=? and password=?");
		query.setParameter(0,emailId);
		query.setParameter(1, password);
		User user=(User)query.getSingleResult();
		if(user==null)
		return false;
		else
			return true;
	}

    @Transactional
	public boolean registerUser(User user) {
		// TODO Auto-generated method stub
    	Session session=null;
    	
    	try{
    		session=sessionFactory.getCurrentSession();
    		session.save(user);
    		return true;
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    		return false;
    	}
	}

    @Transactional
	public List<Project> showProjects(String emailId) {
		// TODO Auto-generated method stub
    	List<Project> projectList=new ArrayList<Project>();
    	Session session=null;
    	try
    	{
    		User user=getUserSkills(emailId);
    		session=sessionFactory.getCurrentSession();
    		Query query=session.createQuery("from Project where skill1=? and skill2=? and skill3=? and skill4=? and skill5=? and skill6=? and skill7=? and skill8=? and skill9=? and skill10=?");
    		query.setParameter(0,user.getSkill1());
    		query.setParameter(1,user.getSkill2());
    		query.setParameter(2,user.getSkill3());
    		query.setParameter(3,user.getSkill4());
    		query.setParameter(4,user.getSkill5());
    		query.setParameter(5,user.getSkill6());
    		query.setParameter(6,user.getSkill7());
    		query.setParameter(7,user.getSkill8());
    		query.setParameter(8,user.getSkill9());
    		query.setParameter(9,user.getSkill10());
    		
            System.out.println(user.getSkill1()+" "+user.getSkill2());
    		projectList=query.getResultList();
    		System.out.println("Number of matching projects = "+projectList.size());
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	
		return projectList;
	}


    @Transactional
	public User getUserSkills(String emailId) {
		// TODO Auto-generated method stub
    	Session session=sessionFactory.getCurrentSession();
    	Query query=session.createQuery("from User where emailId=?");
    	query.setParameter(0,emailId);
    	User user=(User)query.getSingleResult();
		return user;
	}
}
