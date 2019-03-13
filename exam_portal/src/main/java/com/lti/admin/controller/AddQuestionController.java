package com.lti.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.admin.dto.AddQuestionDTO;
import com.lti.admin.service.AddQuestionService;



@Controller
public class AddQuestionController {
	@Autowired
	private AddQuestionService addQuestionService ;
	@RequestMapping(path="/addQuestionController", method=RequestMethod.POST)
	public String addQuestion(AddQuestionDTO addQuestionDTO) {  
		addQuestionService.add(addQuestionDTO);
		return "success.jsp";
	
	

}
}
