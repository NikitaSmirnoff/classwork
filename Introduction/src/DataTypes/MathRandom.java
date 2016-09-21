package DataTypes;

import java.util.Random;

public class MathRandom {
	
	public static void main(String[] args) {
//		for(int index = 0; index < 10; index++){
//			System.out.println("Roll #" + (index + 1) + " - Die is " + rollFairDie());
//		}
		rollUnfairDie();
	}
	
	public static int rollFairDie(){
//		Random gen = new Random();
//		return gen.nextInt(6) + 1;
		double rand = Math.random(); // Creates random double (0, 1)
		int roll = (int) (6 * rand); // [0, 5]
		return roll + 1; // 0 becomes 1, 5 becomes 6
	}
	
	public static int rollUnfairDie(){ //Roll certain numbers more often than others.
		int roll = rollFairDie();
		int[] results = new int[6];
		int[] favoritedNumbers = {1, 2, 4};
		for (int i = 0; i < 10000; i++){
			for (int index = 0; index < favoritedNumbers.length; index++){
				if (favoritedNumbers[index] == roll){
					// return roll;
					results[roll - 1]++;
				}
			}
			//return rollFairDie();
			results[rollFairDie() - 1]++;
		}
		
		for(int i = 0; i < 6; i++){
			System.out.println((i + 1) + " was rolled " + results[i + 1] + " times.");
		}
		return roll;
	}
}
