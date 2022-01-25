package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanlifecycleApp {

	public static void main(String[] args) {
		AbstractApplicationContext app=new ClassPathXmlApplicationContext("lifecycleconfig.xml");
		beanlifecycle b=(beanlifecycle) app.getBean("book");
		System.out.println(b);
		app.registerShutdownHook();

	}

}
