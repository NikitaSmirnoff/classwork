package introUnit;

public class Sophomore extends Student{
	
	private String internship;

	public Sophomore(String name, String internship) {
		super(name);
		this.internship = internship;
	}
	
	public void talk(){
		super.talk(); // call the super method
		System.out.println("... I am a sophomore!");
		System.out.println("I intern as a " + internship);
	}
}
