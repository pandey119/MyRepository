package com.lti.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Report;
import com.lti.generics.GenericDao;

@Service

public class ViewReportsService {
	@Autowired
	private GenericDao dao;
	public List view() {
		List <Report> report=dao.fetchAll(Report.class);
		return report;
		
		
	}

}
