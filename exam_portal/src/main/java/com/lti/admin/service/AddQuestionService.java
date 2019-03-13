package com.lti.admin.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.admin.dto.AddQuestionDTO;
import com.lti.entity.Option;
import com.lti.entity.Question;
import com.lti.generics.GenericDao;
@Service
public class AddQuestionService {
	@Autowired
	private GenericDao genericDao;
	
	@Transactional
	public void add(AddQuestionDTO addQuestionDTO) {
		Question questionDetails=new Question();
		
		questionDetails.setQuestion(addQuestionDTO.getQuestion());
		questionDetails.setSubjectName(addQuestionDTO.getSubjectName());
		questionDetails.setLevelName(addQuestionDTO.getLevelName());
		questionDetails=(Question)genericDao.save(questionDetails);
		List<Option> option=new ArrayList<Option>();
		Option option1=new Option();
		Option option2=new Option();
		Option option3=new Option();
		Option option4=new Option();
		int value=addQuestionDTO.getRightOptionNumber();
		if(value==1) {
			option1.setIs_right(true);
		}else if(value==2){
			option2.setIs_right(true);
		}else if(value==3) {
			option3.setIs_right(true);
		}else {
			option4.setIs_right(true);
		}
		option1.setQuestionDetails(questionDetails);
		option1.setOptionText(addQuestionDTO.getOptions()[0]);

		option2.setQuestionDetails(questionDetails);
		option2.setOptionText(addQuestionDTO.getOptions()[1]);

		option3.setQuestionDetails(questionDetails);
		option3.setOptionText(addQuestionDTO.getOptions()[2]);

		option4.setQuestionDetails(questionDetails);
		option4.setOptionText(addQuestionDTO.getOptions()[3]);
		
		
		
		option.add(option1);
		option.add(option2);
		option.add(option3);
		option.add(option4);
		
		for (Option optionDetails : option) {
			genericDao.save(optionDetails);
			
		}
		
		
		
		
		
	}

}
