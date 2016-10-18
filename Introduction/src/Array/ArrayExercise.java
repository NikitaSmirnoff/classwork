package Array;

public class ArrayExercise {
	
	// Populate with 1 - 50
	public static void populate(int[] array) {
		for(int index = 0; index < array.length; index++) {
			array[index] = index;
//			System.out.println(array[index]);
		}
	}
	
	// Populate with random numbers
	public static void populateRandom(int[] array) {
		for(int index = 0; index < array.length; index++) {
			array[index] = 1 + (int)(50 * Math.random());
			System.out.println(array[index]);
		}
	}
	
	// Populate with dice rolls
	public static void populateDiceRolls(int[] array) {
		for(int index = 0; index < array.length; index++) {
			array[index] = (1 + (int)(6 * Math.random())) + (1 + (int)(6 * Math.random()));
			System.out.println(array[index]);
		}
	}
	
	// List every card in a standard deck of cards
		public static String listDeck() {
			int i = 0;
			String[] deckArray = new String[52];
			String[] suitArray = {"Hearts", "Spades", "Clubs", "Diamonds"};
			String[] classArray = {"A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
			
			for(int suit = 0; suit < suitArray.length; suit++) {
				for(int n = 0; n < classArray.length; n++) {
					deckArray[i] = classArray[n] + " of " + suitArray[suit];
					i++;
				}
			}
			return deckArray;
		}
}
