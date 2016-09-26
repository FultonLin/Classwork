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

}
