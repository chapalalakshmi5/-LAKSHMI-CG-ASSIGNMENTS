package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionsApp {
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("collectionconfig.xml");
		question que=(question) context.getBean("question1");
		System.out.println(que);
		
	}

}
