package com.trainee.hibernate.dao.impl;


import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.trainee.hibernate.dao.StudentDao;
import com.trainee.hibernate.entity.Student;

@Repository
public class StudentDaoImpl implements StudentDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public void save() {
		Session session = sessionFactory.getCurrentSession();
		Student user = new Student(123,"Chaitanya","Hari","emailid@something.com");
		session.save(user);
	}
	
//	select * from student 
	
	@Transactional
	public void retrieve() {
		Session session = sessionFactory.getCurrentSession();
		String hql = "SELECT S FROM Student S ";
		Query query = session.createQuery(hql);
		List results = query.list();
		System.out.println("Students list : "+results.get(0));
	}
	
	@Transactional
	public void retrieveUsingCriteria() {
		Session session = sessionFactory.getCurrentSession();
		
		Criteria criteria = session.createCriteria(Student.class);
		criteria.add(Restrictions.eq("firstname", "Chaitanya"));
        
		
		
		List students = criteria.list();
        System.out.println("Students list : "+students.get(0));
	}
	
	
	
	
}