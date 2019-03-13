package com.lti.admin.dto;

public class AddQuestionDTO {

	String question;
	String subjectName;
	String levelName;

	String[] options;
	int rightOptionNumber;
	
	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getLevelName() {
		return levelName;
	}
	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}
	public String[] getOptions() {
		return options;
	}
	public void setOptions(String[] options) {
		this.options = options;
	}
	public int getRightOptionNumber() {
		return rightOptionNumber;
	}
	public void setRightOptionNumber(int rightOptionNumber) {
		this.rightOptionNumber = rightOptionNumber;
	}

	

}
