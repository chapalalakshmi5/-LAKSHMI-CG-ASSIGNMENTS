package com.springcore;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class student implements ApplicationContextAware,BeanNameAware {
	private int studentid;
	private  String studentName;
	private String studentAddress;
	private ApplicationContext applicationContext=null;
	
	@Override
	public String toString() {
		return "student [studentid=" + studentid + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	
	public student(int studentid, String studentName, String studentAddress) {
		super();
		this.studentid = studentid;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext=applicationContext;
		
	}
	public void setBeanName(String beanName) {
		System.out.println("beanname is:  "+beanName);
		
	}
	
	

}
