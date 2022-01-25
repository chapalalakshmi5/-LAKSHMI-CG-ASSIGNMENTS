package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomeramainApp {
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("customeraddress.xml");
		System.out.println("by using springcontainer");
		Customer c=(Customer)context.getBean("customer");
		System.out.println(c);
	}

}
