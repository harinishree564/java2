package demoofMaven.mavendemo;

import org.springframework.beans.factory.annotation.Autowired;

public class MessagePass {

	MyMessage msg;

	public MyMessage getMsg() {
		return msg;
	}
	@Autowired

	public void setMsg(MyMessage msg) {
		this.msg = msg;
	}
	
	void displaymsg() {
		msg.display();
		}
	
}

