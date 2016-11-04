package CaveExplorer;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayIntro {
	
	public static String[][] arr2D;
	public static String[][] pic;
	public static int i;
	public static int j;
	public static Scanner in;
	
	public static void main(String[] args) {
		
		arr2D = new String[5][4];
		pic = new String[5][4];
		
		for(int row = 0; row < arr2D.length; row++){
			for(int col = 0; col < arr2D[row].length; col++){
				arr2D[row][col] = "(" + row + ", " + col + ")";
			}
		}
		i = 2;
		j = 3;
		in = new Scanner(System.in);
		startExploring();
//		boolean[][] mines = new boolean[6][6];
//		createMines(mines, 10);
//		String[][] field = new String[mines.length][mines[0].length];
//		matchValues(field, mines);\
		
//		printPic(field);
		
//		printPic(generateMap(5, 5));
	}
	
	private static void startExploring(){
		while(true){
			printPic(pic);
			System.out.println("You are in room " + arr2D[i][j]);
			System.out.println("What do you want to do");
			String input = in.nextLine();
			while(!isValid(input)){
				System.out.println("Please enter " + "w, a, s, or d.");
				input = in.nextLine();
			}
			interpretInput(input.toLowerCase());
		}
	}
	
	private static void interpretInput(String input) {
		int iOrig = i;
		int jOrig = j;
		if(input.equals("w") && i > 0) 
			i--;
		else if(input.equals("a") && j > 0) 
			j--;
		else if(input.equals("s") && i + 1 < arr2D.length) 
			i++;
		else if(input.equals("d") && j + 1 < arr2D[0].length) 
			j++;
		if(iOrig == i && jOrig == j){
			System.out.println("You are at the edge of the universe. You can move no farther that direction.");
		}
		
	}

	private static boolean isValid(String input) {
		String lc = input.toLowerCase();
		String[] keys = {"w", "a", "s", "d"};
		for(String key:keys){
			if(key.equals(lc))
				return true;
		}
		return false;
	}

	private static String[][] generateMap(int i, int j) {
		String[][] map = new String[(i * 5) - (i - 1)][(j * 4) - (j - 1)];
		
		for(int row = 0; row < map.length; row++){
			for(int col = 0; row < map[0].length; col++){
				if(row % 3 == 0){
					map[row][col] = "_";
				}else{
					if(col % 3 == 0){
						map[row][col] = "|";
					}else{
						map[row][col] = " ";
					}
				}
			}
		}
			
		return map;
		
	}

	private static void matchValues(String[][] field, boolean[][] mines) {
		for(int row = 0; row < field.length; row++){
			for(int col = 0; col < field[0].length; col++){
				if(mines[row][col]){
					field[row][col] = "X";
				}else{
					field[row][col] = countAdjacent(mines, row, col);
				}
			}
		}
		
	}

	private static String countAdjacent(boolean[][] mines, int r, int c) {
		int count = 0;
		
//		for(int row = r - 1; row <= r + 1; row++){
//			for(int col = c - 1; col <= c + 1; col++){
//				if(row != r && col != c){
//					if(row >= 0 && row < mines.length && col >= 0 && col < mines[row].length)
//					count++;
//				}
//			}
//		}
		
//		for(int row = 0; row < mines.length; row++){
//			for(int col = 0; col < mines[row].length; col++){
//				if(Math.abs(row - r) + Math.abs(col - c) == 1 && mines[row][col]){
//					count++;
//				}
//			}
//		}
		
		count+=validAndTrue(mines, r - 1, c);
		count+=validAndTrue(mines, r + 1, c);
		count+=validAndTrue(mines, r, c + 1);
		count+=validAndTrue(mines, r, c - 1);
		return count + "";
	}

	private static int validAndTrue(boolean[][] mines, int i, int j) {
		if(i > 0 && i < mines.length && j >= 0 && j < mines[i].length && mines[i][j]){
			return 1;
		}
		else return 0;
		
	}

	private static void createMines(boolean[][] mines, int numberOfMines) {
		while(numberOfMines > 0){
			int row = (int)(Math.random() * mines.length);
			int col = (int)(Math.random() * mines[0].length);
			if(!mines[row][col]){
				mines[row][col] = true;
				numberOfMines--;
			}
		}
		
	}

	public static void printPic(String[][] pic) {
		
		for(int row = 0; row < pic.length; row++){
			
			for(int col = 0; col < pic[row].length; col++){
				System.out.print(pic[row][col]);
			}
			System.out.println();
		}
	}
	
	public static void drawing() {
		
		String[][] pic = new String[10][8];
		
		for(int row = 0; row < pic.length; row++){
			
			for(int col = 0; col < pic[row].length; col++){
				pic[row][col] = ".";
			}
		}
		
		pic[1][2] = "O";
		pic[0][2] = "|";
		pic[2][2] = "|";
		pic[1][1] = "-";
		pic[1][3] = "-";
		pic[0][1] = "\\";
		pic[2][3] = "\\";
		pic[0][3] = "/";
		pic[2][1] = "/";
		
		for(int row = 7; row < pic.length; row++){
			
			for(int col = 0; col < pic[row].length; col++){
				pic[row][col] = "M";
			}
		}
		for(int i = 0; i < 2; i++){
			int ran1 = (int)(7 * Math.random());
			int ran2 = 1 + (int)(7 * Math.random());
			pic[ran1][ran2 - 1] = "/";
			pic[ran1][ran2] = "v";
			pic[ran1][ran2 + 1] = "\\";
		}
		for(int col = 1; col < pic[0].length; col++){
			pic[0][col] = "_";
		}
		for(int col = 1; col < pic[0].length; col++){
			pic[9][col] = "_";
		}
		for(int row = 0; row < pic.length; row++){
			pic[row][0] = "|";
		}
		for(int row = 0; row < pic.length; row++){
			pic[row][7] = "|";
		}
		pic[0][0] = " ";
		pic[0][7] = " ";
		
		printPic(pic);
	}

}
