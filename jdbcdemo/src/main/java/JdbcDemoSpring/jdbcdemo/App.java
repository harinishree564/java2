package JdbcDemoSpring.jdbcdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext  context=new ClassPathXmlApplicationContext("config.xml");
    	 EmployeeOperations op=(EmployeeOperations)context.getBean("operationdemo");
    	 
    	 Employee e1=new Employee();
    	 e1.setEmail("xyz");
    	 e1.setId("10");
    	 e1.setName("harini");
    	 e1.setSalary("12345");
    	 
	int result=     op.insert(e1);
System.out.print(result);
    	
    	
    	
    	
    }
}
