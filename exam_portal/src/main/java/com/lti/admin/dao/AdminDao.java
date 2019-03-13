package com.lti.admin.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Question;
import com.lti.generics.GenericDao;
@Repository

public class AdminDao extends GenericDao {
	@PersistenceContext
	private EntityManager entityManager;
	@Transactional
	public void delete(int id) {
	Question q=entityManager.find(Question.class, id);
		entityManager.remove(q);
	}

}
