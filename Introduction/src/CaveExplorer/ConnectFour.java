package CaveExplorer;

import java.util.Scanner;

public class ConnectFour {
	
	public static String[][] arr2D;
	public static String[][] pic;
	public static int i;
	public static int j;
	public static Scanner in;
	
	public static void main(String[] args) {
		
		arr2D = new String[6][8];
		pic = new String[6][8];
		
		in = new Scanner(System.in);
		startDropping();
	}
	
	private static void startDropping(){
		while(true){
			System.out.println("01234567");
			printPic(pic);
			System.out.println("Pick a column to drop your piece.");
			String input = in.nextLine();
			while(!isValid(input)){
				System.out.println("Please enter " + "numbers 0 to 7.");
				input = in.nextLine();
			}
			interpretInput(input);
		}
	}
	
	public static void printPic(String[][] pic) {
		
		for(int row = 0; row < pic.length; row++){
			
			for(int col = 0; col < pic[row].length; col++){
				pic[row][col] = " ";
				System.out.print(pic[row][col]);
			}
			System.out.println();
		}
	}
	
	private static void interpretInput(String input) {
		for(int row = arr2D.length - 1; row > -1; row--){
			if(!pic.equals("O")){
				pic[row][Integer.parseInt(input)] = "O";
			}
		}
	}

	private static boolean isValid(String input) {
		String[] numArr = {"0", "1", "2", "3", "4", "5", "6", "7"};
		for(String key:numArr){
			if(key.equals(input))
				return true;
		}
		return false;
	}
}
