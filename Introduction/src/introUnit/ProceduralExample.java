/**
 * 
 */
package introUnit;

/**
 * @author Student6
 *
 */
public class ProceduralExample {
	public static void main(String[]args){
		String[] names = {"Jillian", "Joseph", "Jordan"};
		String[] years = {"Sophomore", "Junior", "Senior"};
		System.out.println("My name is " + names[0] + ", and I am a " + years[0]);
	}
}



// HOMEWORK

public static void main(String[] args){
	int[] some = {3, 4, 5};
	System.out.println(average(some));
}

public static int average(int[] arr){
	int sum = 0;
	for(int i = 0, i < arr.length; i++)
	{
		sum += arr[i];
	}
	System.out.println(sum);
	int numItems = arr.length;
	int avg = sum / numItems;
	return avg;
}
