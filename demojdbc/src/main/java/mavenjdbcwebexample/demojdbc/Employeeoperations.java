package mavenjdbcwebexample.demojdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class Employeeoperations {
 JdbcTemplate jdbcTemplate;
 
 void setjdbcTemplate(JdbcTemplate jdbcTemplate )
 
 {
	 this.jdbcTemplate=jdbcTemplate;
	 
 }
 
   int insert(Employee emp)
   {

	   String email=emp.getEmail();
	   String name=emp.getName();
	   String id=emp.getId();
	   String salary=emp.getSalary();
	    String query="insert into Employee values("+name+","+email+","+id+","+salary+")";
	  int result=jdbcTemplate.update(query);
	    return result;
   }
}
