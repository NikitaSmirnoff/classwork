package DataTypes;

public class DataTypes {

	public static void main(String[] args){
		// System.out.println(3/2); //double divided by integer
		
		String ten = "10"; // Numbers are converted to strings and treated as characters, not values
		String two = "2";
		if (ten.compareTo(two)>0)System.out.println("10 is greater than 2");
		else System.out.println("10 is not greater than 2"); 
		//10 is not greater because alphabetically 2 comes after 1 and 0, thus 2 being greater
	}

}
