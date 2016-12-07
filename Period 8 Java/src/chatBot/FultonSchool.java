package chatBot;

public class FultonSchool implements ChatBot {

	private boolean inSchoolLoop;
	private String schoolResponse;
	private String[] gameSong = {"Do you wanna play a game?","Come on lets go and play",
			"For the first time in forever","Come out and play","It's like you've gone away...",
			"We used to be best buddies","And now we're not","I wish you would tell me why!"};
	
	public void talk() {
		inSchoolLoop = true;
		while(inSchoolLoop){
			FultonMain.print("(Type 'quit' to go back.");
			schoolResponse = FultonMain.promptInput();
			if(schoolResponse.indexOf("quit") >= 0){
				inSchoolLoop = false;
				FultonMain.promptForever();
			} 
			FultonMain.print("That's my favorite part about school");

			for(int i = 0; i <= gameSong.length; i++){
				FultonMain.print("gameSong[i]");
			}
		}

	}

	public boolean isTriggered(String userInput) {
		String[] triggers = {"school","class","teacher"};
		
		for(int i = 0; i < triggers.length; i++){
			if(FultonMain.findKeyword(userInput, triggers[i], 0) >= 0){
			return true;
			}
		}

		if(FultonMain.findKeyword(userInput, "class", 0) >= 0){
			return true;
		}

		if(FultonMain.findKeyword(userInput, "school", 0) >= 0){
			return true;
		}
		return false;
	}

}
