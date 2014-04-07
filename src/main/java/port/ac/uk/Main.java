package port.ac.uk;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "main", eager = true)
@RequestScoped
public class Main {

	@ManagedProperty(value="#{message}")
	private Message messageBean;
	
	private String message;
	private Molecule m = new Molecule();
	
	public Main() {
		System.out.println("TestJSF started");
	}

	public String getMessage() {
		if(messageBean != null)
			message = messageBean.getMessage();
		return message;
	}
	
	public void setMessageBean(Message message){
		this.messageBean = message;
	}
	
}