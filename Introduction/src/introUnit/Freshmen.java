package introUnit;

public class Freshmen extends Student{
	
	private String internship;

	public Freshmen(String name, String internship) {
		super(name);
		this.internship = internship;
	}
	
	public void talk(){
		super.talk(); // call the super method
		System.out.println("... I am a freshmen!");
		System.out.println("I intern as a " + internship);
	}
}
