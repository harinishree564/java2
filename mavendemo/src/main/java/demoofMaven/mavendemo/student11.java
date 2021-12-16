package demoofMaven.mavendemo;

import org.springframework.beans.factory.annotation.Autowired;

public class student11 {

	address add;

	public address getAdd() {
		return add;
	}
	
	
	@Autowired

	public void setAdd(address add) {
		this.add = add;
	}
  void	displayaddress() {
		add.display();
		}
	
	
}
