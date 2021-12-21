package project33;

import java.util.ArrayList;
import java.util.Scanner;
public class arraylist4 {

	
	public static void main(String aa[]) 
    {
//    Object //parent of all the classes



        ArrayList<student> list=new ArrayList<>();//Object

        student s1=new student("harini", "400/500","450/500","350/500");
        
        list.add(s1);
       
        

        for(student  s  : list)
        {
        System.out.println(s.name+" "+s.marks1+" "+s.marks2+" "+s.marks3);    
        }

    }
}
class student
{
    String name;
    String  marks1,marks2,marks3;

    public student(String name, String marks1,String  marks2,String  marks3) {
		super();
		this.name = name;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}

}
	

