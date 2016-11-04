package scopes;

import org.springframework.stereotype.Component;

//@Component
public class myMessage
{
	private String msg;
	

	@Override
	public String toString() {
		return "myMessage [msg=" + msg + "]";
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
