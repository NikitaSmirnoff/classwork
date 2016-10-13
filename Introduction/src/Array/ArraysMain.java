package Array;

public class ArraysMain {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		String[] someStrings = new String[100];
		populateArray(someStrings);
		changeString(someStrings[99]);
		printArray(someStrings);
		long endTime = System.currentTimeMillis();
		System.out.println("Completed method in " + (endTime - startTime) + " milliseconds");
	}

	private static void populateArray(String[] a) {
		for(int index = 0; index < a.length; index++){
			a[index] = "Value " + (index + 1);
		}
		
	}
	
	private static void changeString(String s){
		s = "This string has been changed!"; 
	}

	private static void printArray(String[] a) {
		for(String s: a){
			System.out.println(s);
		}
		
	}

	public static void arrayIntroMethod(){
		// Construct 2 integer arrays
		//these two methods do the same thing
		int[] zeros1 = {0,0,0};
		int[] zeros2 = new int[3];
		
		boolean[] booleans = new boolean[3];
		
		//FOR LOOP
		//	- the index of the data is important to reference
		//	- you need to customize how you iterate
		for(int index = 0; index < booleans.length; index++){
			System.out.println(index + ") " + booleans[index]);
		}
				
		//FOR-EACH LOOP
		//always goes in order, does not keep track of index
		//easier to type
		for(boolean b: booleans){
			System.out.println(b);
		}
			
		//these two constructors are different				
		String[] strings1 = {"","",""};
		String[] strings2 = new String[3];
		for(int index = 0; index < strings2.length; index++){
			strings2[index] = "Value " + (index + 1);
			System.out.println("");
		}
		
		for(String s: strings1){
			System.out.println(s);
		}
		for(String s: strings2){
			System.out.println(s);
		}
	}
}
