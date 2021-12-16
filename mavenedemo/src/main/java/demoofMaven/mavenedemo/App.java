package demoofMaven.mavenedemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class App 
{
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("NewFile.xml");
		// TODO Auto-generated method stub
		student s= (student)context.getBean("s1");
		s.display();
	
}
}