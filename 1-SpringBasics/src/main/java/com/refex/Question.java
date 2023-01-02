package com.refex;

public class Question {
	private String qeus;
	private Answer ans;
	
	public String getQeus() {
		return qeus;
	}
	public void setQeus(String qeus) {
		this.qeus = qeus;
	}
	public Answer getAns() {
		return ans;
	}
	public void setAns(Answer ans) {
		this.ans = ans;
	}
	
	public Question(String qeus, Answer ans) {
		super();
		this.qeus = qeus;
		this.ans = ans;
	}
	
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Question [qeus= " + qeus + ", ans= " + ans + "]";
	}
	
}
