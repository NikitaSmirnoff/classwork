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
		Student jillian = new Senior("Jillian");
		Student jordan = new Student("Jordan");
		Student jason = new Student("Jason");
		jillian.talk();
		jordan.talk();
		jason.talk();

	}

}
