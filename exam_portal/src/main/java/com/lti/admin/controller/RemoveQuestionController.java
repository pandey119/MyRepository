package com.lti.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.admin.service.RemoveQuestionService;
import com.lti.entity.Question;

@Controller
public class RemoveQuestionController {
	@Autowired
	private RemoveQuestionService removeQuestionService ;
	@RequestMapping(path="/removeQuestionController", method=RequestMethod.POST)
	public String removeQuestionContoller(int qid) {  
		removeQuestionService.removeQuestion(qid);
		return "success.jsp";
	

}
	}
