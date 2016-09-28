package ChatBot;

public class FultonSchool implements ChatBot {

	private boolean inSchoolLoop;
	private String schoolResponse;
	
	public void talk() {
		inSchoolLoop = true;
		while(inSchoolLoop){
			FultonMain.print("(Type 'quit' to go back.");
			//static call on promptInput method from FultonMain class
			schoolResponse = FultonMain.promptInput();
			if(schoolResponse.indexOf("quit") >= 0){
				inSchoolLoop = false;
				FultonMain.promptForever();
			}
			FultonMain.print("That's my favorite part about school");
		}

	}

	public boolean isTriggered(String userInput) {
		String[] triggers = {"school","class","teacher"};
		//idea: create a for loop to iterate
		//through your array to triggers
		
//		for(int i = 0; i < triggers.length; i++){
//			if(FultonMain.findKeyword(userInput, triggers[i], 0) >= 0){
//			return true;
//			}
//			return false;
//		}
		

		if(FultonMain.findKeyword(userInput, "class", 0) >= 0){
			return true;
		}

		if(FultonMain.findKeyword(userInput, "school", 0) >= 0){
			return true;
		}
		return false;
	}

}
