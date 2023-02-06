package com.velocity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="question")
public class Question {	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int Que_id;
	@Column(name="ques")
	private String Ques;
	
	public int getQue_id() {
		return Que_id;
	}
	public void setQue_id(int que_id) {
		Que_id = que_id;
	}
	public String getQues() {
		return Ques;
	}
	public void setQues(String ques) {
		Ques = ques;
	}
	
	

}
