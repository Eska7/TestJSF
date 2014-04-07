package port.ac.uk;

public class Molecule {

	private int id;
	private String  name;
	
	public Molecule() {
		this.id = 0;
		this.name = "Test";
	}
	
	public Molecule(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String presentation() {
		return "My name is " + this.name;
	}
	
	
}
