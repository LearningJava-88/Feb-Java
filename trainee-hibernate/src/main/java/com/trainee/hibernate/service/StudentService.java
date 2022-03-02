package com.trainee.hibernate.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trainee.hibernate.dao.StudentDao;

@Service
public class StudentService{

	@Autowired
	private StudentDao studentDao;
	
	public void save() {
		studentDao.save();
	}
	
	public void retrieve() {
	   studentDao.retrieve();
	}
	
	public void retrieveUsingCriteria() {
		studentDao.retrieveUsingCriteria();
	}
	
}