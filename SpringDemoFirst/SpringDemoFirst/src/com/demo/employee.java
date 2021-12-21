package com.demo;

public class employee {
int id,salary;
String address,name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
void display() {
	System.out.print("id :"+id+" salary:"+salary+  "address:"+address+" name:"+name);
}



}
