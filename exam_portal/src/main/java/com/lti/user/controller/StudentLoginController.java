package com.lti.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.admin.dto.StudentLoginDTO;
import com.lti.user.service.StudentLoginService;

@Controller
public class StudentLoginController {
	@Autowired
	private StudentLoginService studentLoginService ;
	//it helps to store directly the bean data

@RequestMapping(path="/studentLogin", method=RequestMethod.POST)
public String register(StudentLoginDTO studentLogin) {  
	boolean isValid=studentLoginService.isValid(studentLogin);
	if(isValid)
		return "/studentHomePage.jsp";
	else
		return "/fail.jsp";
	
	
	
}
}
