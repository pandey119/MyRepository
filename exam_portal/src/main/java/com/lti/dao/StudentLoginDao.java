package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;


import com.lti.entity.StudentLogin;

@Repository
public class StudentLoginDao {
	@PersistenceContext
	private EntityManager entityManager;
	public boolean check(StudentLogin studentLogin) {
		String sql="select id from tbl_studentlogin where username= "+studentLogin.getPassword()+" and password= "+studentLogin.getPassword();
		StudentLogin studentLogin2  = entityManager.find(StudentLogin.class, studentLogin.getId());
		String password=studentLogin2.getPassword();
		if(studentLogin.getPassword().equals(password)) {
			return true;
		}
		else
		return false;
		
	}

}
