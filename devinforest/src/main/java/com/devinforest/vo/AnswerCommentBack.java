package com.devinforest.vo;

public class AnswerCommentBack {
	private int answerCommentNo;
	private int answerNo;
	private String memberName;
	private String answerCommentContent;
	private String answerCommentDate;
	private String answerCommentBackDate;
	private String answerCommentIp;
	
	public int getAnswerCommentNo() {
		return answerCommentNo;
	}
	public void setAnswerCommentNo(int answerCommentNo) {
		this.answerCommentNo = answerCommentNo;
	}
	public int getAnswerNo() {
		return answerNo;
	}
	public void setAnswerNo(int answerNo) {
		this.answerNo = answerNo;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getAnswerCommentContent() {
		return answerCommentContent;
	}
	public void setAnswerCommentContent(String answerCommentContent) {
		this.answerCommentContent = answerCommentContent;
	}
	public String getAnswerCommentDate() {
		return answerCommentDate;
	}
	public void setAnswerCommentDate(String answerCommentDate) {
		this.answerCommentDate = answerCommentDate;
	}
	public String getAnswerCommentBackDate() {
		return answerCommentBackDate;
	}
	public void setAnswerCommentBackDate(String answerCommentBackDate) {
		this.answerCommentBackDate = answerCommentBackDate;
	}
	public String getAnswerCommentIp() {
		return answerCommentIp;
	}
	public void setAnswerCommentIp(String answerCommentIp) {
		this.answerCommentIp = answerCommentIp;
	}
	
	@Override
	public String toString() {
		return "AnswerCommentBack [answerCommentNo=" + answerCommentNo + ", answerNo=" + answerNo + ", memberName="
				+ memberName + ", answerCommentContent=" + answerCommentContent + ", answerCommentDate="
				+ answerCommentDate + ", answerCommentBackDate=" + answerCommentBackDate + ", answerCommentIp="
				+ answerCommentIp + "]";
	}
}
