package port.ac.uk;

public class Molecule {

	private int id;
	private String name;

	public Molecule() {
		this.id = 0;
		this.name = "Test";
		System.out.println("Molecule [Default init]");
	}

	public Molecule(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Molecule [Param init]");
	}

	public String presentation() {
		return "I am " + this.name;
	}

}
