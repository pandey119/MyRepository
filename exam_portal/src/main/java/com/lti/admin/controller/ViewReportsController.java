package com.lti.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.admin.service.ViewReportsService;

@Controller
public class ViewReportsController {
	@Autowired
	private ViewReportsService viewReportsService ;
	@RequestMapping(path="/viewReportsController", method=RequestMethod.POST)
	public String viewReports() {  
		viewReportsService.view();
		return "success.jsp";
	
	

}
	
}
