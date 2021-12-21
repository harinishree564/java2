package com.demo;

public class books {
	
	int id,publisher,price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPublisher() {
		return publisher;
	}

	public void setPublisher(int publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
void display() {
	System.out.print("id :"+id+" publisher:"+publisher+  "price:"+price);
}
}
