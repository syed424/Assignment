package com.syed.spring.Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[]  args) {
		//Employee employee = new Employee (102, "Syed",   "Atlanta");
		//System.out.println("Employee Created  " + employee	);
		 
		ApplicationContext  context = new ClassPathXmlApplicationContext("springContext.xml");
		
		Employee emp = (Employee)context.getBean("employee");
		System.out.println(emp);
		
		//normal java new keyword approach
		
		Student student = new Student();
		student.setStudentId(1);
		student.setStudentName("syed");
		student.populateAddress(2, "US", 50024);

		System.out.println(student);
			}
}
 