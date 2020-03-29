package com.syed.spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[]  args) {
		
		 
		ApplicationContext  context = new ClassPathXmlApplicationContext("springContext.xml");
		
		Employee emp = (Employee)context.getBean("employee");
		System.out.println(emp);
		
		
			}
}
 