package Array;

public class ArraysMain {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		testPrimes(100000);
		
		long endTime = System.currentTimeMillis();
		System.out.println("Completed method in " + (endTime - startTime) + " milliseconds");
	}
	private static void testPrimes(int numberToTest){
		int lastToCheck = (int)(Math.sqrt(numberToTest));
		boolean[] theNumbers = new boolean[numberToTest];
		for(int i = 0; i < numberToTest; i++){
			theNumbers[i] = true;
		}
		theNumbers[0] = false;
		theNumbers[1] = false;
		for(int prime = 2; prime <= lastToCheck; prime++){
			//When checking 50 numbers,
			//tests 2,3,4,5,6,7 as if prime
			if(theNumbers[prime]){
				//only checks numbers that are prime
				//(numbers that haven't been crossed off)
				//wont check 4 and 6 (crossed off by 2)
				System.out.println("\n" + prime + " is prime. Crossing off:");
				boolean first = true;
				for(int test = prime + prime; test < numberToTest; test = test + prime){
					if(!first){
						System.out.print(test + ", ");
						theNumbers[test] = false;
					}else{
						first = false;
					}
				}
			}
		}
		for(int i = 0; i < theNumbers.length; i++){
			if(theNumbers[i]){
				System.out.println(i + " is prime.");
			}
			else{
				System.out.println(i + " is not prime.");
			}
		}
	}
	private static void changeArrayElement(String[] someStrings, int i) {
		someStrings[i] = "new item " + (i + 1);
	}

	private static void changeArray(String[] someStrings) {
		someStrings = new String[100];
		for(int i = 0; i > someStrings.length; i++) {
			someStrings[i] = "new item " + (i + 1);
		}
		
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
