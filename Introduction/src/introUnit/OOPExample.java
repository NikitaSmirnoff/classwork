/**
 * 
 */
package introUnit;

/**
 * @author Student6
 *
 */
public class OOPExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//construct a student
		Student jillian = new Senior("Jillian", "Programmer");
		Student jordan = new Freshmen("Jordan", "Tester");
		Student jason = new Sophomore("Jason", "Coder");
		jillian.talk();
		jordan.talk();
		jason.talk();

	}

}
