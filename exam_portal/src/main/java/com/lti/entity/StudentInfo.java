package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class StudentInfo {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	private String qualification;
	
	OneToMany(mappedBy ="student")
	Set<Report> report;
	
	

}
