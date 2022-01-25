package com.springcore;

import java.util.*;

public class question {
private int questionid;
private List<String> question;
private Set<String> answers;
private Map<Integer,String> answerssequence;
@Override
public String toString() {
	return "question [questionid=" + questionid + ", question=" + question + ", answers=" + answers
			+ ", answerssequence=" + answerssequence + "]";
}
public question(int questionid, List<String> question, Set<String> answers, Map<Integer, String> answerssequence) {
	super();
	this.questionid = questionid;
	this.question = question;
	this.answers = answers;
	this.answerssequence = answerssequence;
}
public question() {
	super();
	// TODO Auto-generated constructor stub
}
public int getQuestionid() {
	return questionid;
}
public void setQuestionid(int questionid) {
	this.questionid = questionid;
}
public List<String> getQuestion() {
	return question;
}
public void setQuestion(List<String> question) {
	this.question = question;
}
public Set<String> getAnswers() {
	return answers;
}
public void setAnswers(Set<String> answers) {
	this.answers = answers;
}
public Map<Integer, String> getAnswerssequence() {
	return answerssequence;
}
public void setAnswerssequence(Map<Integer, String> answerssequence) {
	this.answerssequence = answerssequence;
}



}
