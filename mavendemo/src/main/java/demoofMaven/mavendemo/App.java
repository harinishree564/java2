package demoofMaven.mavendemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App
{
public static void main( String[] args )
{
System.out.println( "Hello World!" );

ApplicationContext context=new ClassPathXmlApplicationContext("NewFile.xml");
//MessagePass pass=(MessagePass)context.getBean("msgpass");
//pass.displaymsg();

student11 s=(student11)context.getBean("address");



s.displayaddress();
}
}