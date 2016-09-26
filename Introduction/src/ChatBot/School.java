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

}
