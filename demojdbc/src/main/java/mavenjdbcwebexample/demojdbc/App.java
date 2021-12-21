package mavenjdbcwebexample.demojdbc;

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
    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	
    	Employeeoperations op=(Employeeoperations)context.getBean("operationdemo");

    	Employee e1=new Employee();
    	e1.setEmail("xyz");
    	e1.setId("23");
    	e1.setName("harini");
    	e1.setSalary("6675");
    	int result=  op.insert(e1);
    	System.out.print(result);
    }
}