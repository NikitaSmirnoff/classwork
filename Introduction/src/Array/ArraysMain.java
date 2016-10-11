package Array;

public class ArraysMain {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		arrayIntroMethod();
		long endTime = System.currentTimeMillis();
		System.out.println("Completed method in " + (endTime - startTime) + " milliseconds");
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
		
		for(String s: strings1){
			System.out.println(s);
		}
		for(String s: strings2){
			System.out.println(s);
		}
	}
}
