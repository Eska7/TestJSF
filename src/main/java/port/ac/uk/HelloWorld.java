package port.ac.uk;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "welcome", eager = true)
public class HelloWorld {

	private Molecule m = new Molecule();
	
	public HelloWorld() {
		System.out.println("TestJSF started!");
	}

	public String getMessage() {
		return m.presentation();
	}
}