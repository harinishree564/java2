package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("MyBeans.xml");
		// TODO Auto-generated method stub
Student s= (Student)context.getBean("s1");
books b =(books)context.getBean("b1");
employee e =(employee)context.getBean("e1");
e.display();
s.display();
b.display();
	}
	
		
}
