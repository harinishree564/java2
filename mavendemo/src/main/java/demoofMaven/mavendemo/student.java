package demoofMaven.mavendemo;

public class student {
	
	int roll;
	String name;





	public student(int roll) {
	super();
	this.roll = roll;



	}



	public student(String name , int roll) {
	this.name=name;
	this.roll=roll;




	}



	void display()
	{
	System.out.print("name :"+name+" rollno :"+roll);
	}
	}


