package ChatBot;

public class School implements Topic {

	private boolean inSchoolLoop;
	private String schoolResponse;
	
	public void talk() {
		inSchoolLoop = true;
		while (inSchoolLoop){
			NikitaMain.print("Tell me about school.");
			schoolResponse = NikitaMain.getInput();
			if(schoolResponse.indexOf("stop") >= 0){
				inSchoolLoop = false;
				NikitaMain.talkForever();
			}
			else{
			NikitaMain.print("That's my favorite " + "part about school too.");
			}
		}
	}

	public boolean isTriggered(String userInput) {
		if(NikitaMain.findKeyword(userInput, "school", 0) >= 0){
			return true;
		}
		if(NikitaMain.findKeyword(userInput, "class", 0) >= 0){
			return true;
		}
		return false;
	}

}
