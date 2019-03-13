package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Option_Details")
public class Option {
	@Id
	@GeneratedValue
	private int oid;
	
	@Column(name="optionText")
	private String optionText;
	
	@ManyToOne
	@JoinColumn(name = "qid")
	private Question questionDetails;
	
	private boolean is_right;
	
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	
	public String getOptionText() {
		return optionText;
	}
	public void setOptionText(String optionText) {
		this.optionText = optionText;
	}
	public Question getQuestionDetails() {
		return questionDetails;
	}
	public void setQuestionDetails(Question questionDetails) {
		this.questionDetails = questionDetails;
	}
	public boolean isIs_right() {
		return is_right;
	}
	public void setIs_right(boolean is_right) {
		this.is_right = is_right;
	}
	
	
	
}
