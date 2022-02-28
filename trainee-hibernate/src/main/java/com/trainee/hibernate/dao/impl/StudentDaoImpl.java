package com.trainee.hibernate.dao.impl;


import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
		Student user = new Student(123,"Ravi","Kavitha","emailid@something.com");
		session.save(user);
	}
	
	
	
	
	
}