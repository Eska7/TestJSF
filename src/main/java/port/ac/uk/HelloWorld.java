package port.ac.uk;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "welcome", eager = true)
public class HelloWorld {
	public HelloWorld() {
		System.out.println("TestJSFBasic started!");
	}

	public String getMessage() {
		return "Hello World!";
	}
}