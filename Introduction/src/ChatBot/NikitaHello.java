package ChatBot;

public class NikitaHello implements Topic {

	private boolean inHelloLoop;
	private String helloResponse;
	private int helloCount;
	
	//responses are constants (never change, always exist)
	private static String[] calmResponses = {"We've already said our hellos. Remember?", "Yes, hello to you too. Let's actually talk."};
	private static String[] angryResponses = {"Okay, seriously. This has to stop.", "You are beginning to annoy me.", "We've SAID HELLO!"};
	
	public NikitaHello(){
		helloCount = 0;
	}
	
	
	public void talk() {
		inHelloLoop = true;
		while(inHelloLoop){
			helloCount++;
			printResponse();
			helloResponse = NikitaMain.getInput();
			if(!isTriggered(helloResponse)){
				inHelloLoop = false;
				NikitaMain.talkForever();
			}
		}

	}

	private void printResponse() {
		int responseIndex = 0;
		
		if(helloCount < 5){
			responseIndex = (int)(Math.random() * calmResponses.length);
			NikitaMain.print(calmResponses[responseIndex]);
		}
		else{
			responseIndex = (int)(Math.random() * angryResponses.length);
			NikitaMain.print(angryResponses[responseIndex]);
		}
		
	}


	@Override
	public boolean isTriggered(String userInput) {
		if(NikitaMain.findKeyword(userInput, "hello", 0) >= 0){
			return true;
		}
		if(NikitaMain.findKeyword(userInput, "hi", 0) >= 0){
			return true;
		}
		if(NikitaMain.findKeyword(userInput, "hey", 0) >= 0){
			return true;
		}
		return false;
	}

}
