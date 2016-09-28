package ChatBot;

import java.util.Scanner;

public class NikitaMain {
	
	
	static Scanner input;
	static String user;
	static boolean inLoop;
	static String response;
	static Topic school;
	static Topic like;
	
	public static void main(String[] args) {
		createTopics();
		promptName();
		talkForever();

	}
	
	public static void promptName(){
		print("Hello, human! I am a " + "board covered with " + "semiconductors and " + "other such electronic " + "components. " + "What is your name?");
		user = input.nextLine();
		print("Awesome! I will call you " + user + " until you terminate me.");
	}

	public static void talkForever(){
		inLoop = true;
		while(inLoop){
			print("Greetings, " + user + ". How are you?");
			response = getInput();
			if(findKeyword(response, "good", 0) >= 0){
				print("I'm so happy you're good.");
			}
			else if(findKeyword(response, "like", 0) >= 0){
				inLoop = false; //exit this loop
				school.talk();
			}
			else if(findKeyword(response, "school", 0) >= 0){
				inLoop = false; //exit this loop
				school.talk();
			}
			else{
				print("I'm sorry, I don't understand you.");
			}
		}
	}
	
	public static int findKeyword(String searchString, String key, int startIndex) {
		//delete white space
		String phrase = searchString.trim();
		//set all letters to lowercase
		phrase = phrase.toLowerCase();
		key = key.toLowerCase();
		
		//System.out.println("The phrase is " + phrase);
		//System.out.println("The key is " + key);
		
		//find position of key
		int psn = phrase.indexOf(key);
		//System.out.println("The position found is " + psn);
		//keep looking for the word
		//until you find the right context
		while(psn >= 0){
			String before = " ";
			String after = " ";
			//if the phrase does not end with this word
			if(psn + key.length() < phrase.length()){
				after = phrase.substring(psn + key.length(), psn + key.length() + 1).toLowerCase();
				//System.out.println("The character after " + key + " is "+ after);
			}
			//if the phrase does not begin with this word
			if(psn > 0){
				before = phrase.substring(psn - 1, psn).toLowerCase();
				//System.out.println("The character after " + key + " is "+ before);
			}
			if(before.compareTo("a") < 0 && after.compareTo("a") < 0){
				//System.out.println(key + " was found at " + psn);
				if(noNegations(phrase, psn)){
					return psn;
				}
			}
			//in case the keyword was not found yet,
			//check the rest of the string
			psn = phrase.indexOf(key, psn + 1);
			//System.out.println(key + " was not found. Checking " + psn);
		}
		return -1;
	}
	
	//A "helper method" that contributes to the functionality of another method.
	//This method is private because it is only being used by the method it is helping.
	//Increases readabilty and can be used many times.
	private static boolean noNegations(String phrase, int index) {
		//check for word "NO " (3 characters)
		//check to see if there is space for the word "NO " to be in front of the index
		if(index - 3 >= 0 && phrase.substring(index - 3, index).equals("no ")){
			return false;
		}
		//check to see if there is space for the word "NOT " to be in front of the index
		if(index - 4 >= 0 && phrase.substring(index - 4, index).equals("not ")){
			return false;
		}
		//check to see if there is space for the word "NEVER " to be in front of the index
		if(index - 6 >= 0 && phrase.substring(index - 6, index).equals("never ")){
			return false;
		}
		//check to see if there is space for the word "N'T " to be in front of the index
		if(index - 4 >= 0 && phrase.substring(index - 4, index).equals("n't ")){
			return false;
		}
		return true;
	}

	private static void promptInput() {
		print("===================================");
		String userInput = input.nextLine();
		print(user + ": " + userInput);
		
	}
	
	public static String getInput(){
		return input.nextLine();
	}
	
	public static void print(String s){
		//Create a multi-line String
		String printString = "";
		int cutoff = 35;
		//Check to see if there are words to add
		//(IOW, is the length of s > 0
		while(s.length() > 0){
			String currentLine = "";
			String nextWord = "";
			//While the currentLine and nextWord are less than the cuttoff
			//AND there are still words to add, do the following loop
			while(currentLine.length() + nextWord.length() <= cutoff && s.length() > 0){
				//Add the next word to the line
				currentLine += nextWord;
				//remove that word
				s =  s.substring(nextWord.length());
				//Get the following word
				int endOfWord = s.indexOf(" ");
				//check to see if this is the last word
				if(endOfWord == -1){
					endOfWord = s.length() - 1;
				}
				//get the next word and space
				nextWord = s.substring(0, endOfWord + 1);
				
			}
			printString += currentLine + "\n";
		}
		System.out.println(printString);
	}
	
	public static void createTopics(){
		input = new Scanner(System.in);
		school = new School();
		like = new NikitaLike();
	}

}