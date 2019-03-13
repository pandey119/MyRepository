package com.lti.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.admin.dao.AdminDao;
@Service
public class RemoveQuestionService {
	@Autowired
	private AdminDao dao;

	public void removeQuestion(int qid) {
	
		dao.delete(qid);

	}

}
