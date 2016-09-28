package ChatBot;

public class NikitaLike implements Topic {

	private boolean inLikeLoop;
	private String likeResponse;
	
	public void talk() {
		NikitaMain.print("Tell me about something you like.");
		inLikeLoop = true;
		while(inLikeLoop){
			likeResponse = NikitaMain.getInput();
			int likePsn = NikitaMain.findKeyword(likeResponse, "like", 0);
			if(likePsn >= 0){
				String thingsLiked = likeResponse.substring(likePsn + 5);
				NikitaMain.print("You are such an interesting person because you like " + thingsLiked + " !");
				
			}else{
				NikitaMain.print("I don't understand you");
			}
		}
	}

	public boolean isTriggered(String userInput) {
		if(NikitaMain.findKeyword(userInput, "like", 0) >= 0){
			return true;
		}
		return false; 
	}

}
