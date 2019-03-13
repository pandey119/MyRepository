package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_report")
public class Report {
	@Id
	@GeneratedValue
	private int rid;
	
	private int score;
	
	private Question question;
	private StudentInfo student;
	
	
	

}
