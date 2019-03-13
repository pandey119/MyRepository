package com.lti.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.lti.admin.dto.AddQuestionDTO;
import com.lti.admin.service.AddQuestionService;
import com.lti.admin.service.RemoveQuestionService;
import com.lti.entity.Question;

public class TestAddQuestion {

	@Test
	public void test() {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/spring-config.xml");
		AddQuestionService service = (AddQuestionService) ctx.getBean("addQuestionService");
		AddQuestionDTO dto=new AddQuestionDTO();
		dto.setLevelName("level1");
		dto.setQuestion("What is hibernate?");
		String[] options= {"long sleep","something peaceful","your favorite part if existed","JPA complaint"};
		dto.setOptions(options);
		dto.setRightOptionNumber(4);
		dto.setSubjectName("JAVA");
		service.add(dto);
		
		
	}
	@Test
	public void testRemove() {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/spring-config.xml");
		RemoveQuestionService service = (RemoveQuestionService) ctx.getBean("removeQuestionService");
		
		service.removeQuestion(21);
		
	}

}
