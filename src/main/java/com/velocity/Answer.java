package com.velocity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Answer")
public class Answer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ans_id;
	@Column(name="ans")
	private String ans;
	@ManyToOne(fetch=FetchType.LAZY)        //it only gives only answer when get ans.
	@JoinColumn(name="Q_id")               //it gives name to foreign key
	private Question ques;
	public int getAns_id() {
		return ans_id;
	}
	public void setAns_id(int ans_id) {
		this.ans_id = ans_id;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public Question getQues() {
		return ques;
	}
	public void setQuestion(Question ques) {
		this.ques = ques;
	}
	@Override
	public String toString() {
		return "Answer [ans_id=" + ans_id + ", answer=" + ans + ", ques=" + ques + "]";
	}
	

}
