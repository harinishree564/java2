package com.demo;

public class Student {

	String name,roll;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}
	
	
	void display()
	{
		System.out.print("Name :"+name+" Rollno :"+roll);
	}
}
