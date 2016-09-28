package ChatBot;

public class FultonHello implements ChatBot{

	private String helloResponse;
	private boolean inHelloLoop;
	
	private String[] calmResponses = {"We already said hello. "+"Let's move the conversation along."
	,"You said hello already, Did you forget?"};
			
	private String[] angryResponses = {"Okay seriously. Stop saying hi,", "What is wrong with you and saying hello?"};
	
	private int helloCount;
	
	public FultonHello(){
		helloCount=0;
	}
	
	public void talk() {
		inHelloLoop = true;
		while(inHelloLoop){
			helloCount++;
			printResponse();//helper method
			helloResponse = FultonMain.promptInput();
			//negate use !
			if(!isTriggered(helloResponse)){
				inHelloLoop = false;
				FultonMain.promptForever();
			}
		}
	}

	private void printResponse() {
		if(helloCount > 4){
			int responseSelection = (int) (Math.random()*angryResponses.length);
			FultonMain.print(angryResponses[responseSelection]);
		}else{

			int responseSelection = (int) (Math.random()*calmResponses.length);
			FultonMain.print(calmResponses[responseSelection]);
		}
	}

	public boolean isTriggered(String userInput) {
		if(FultonMain.findKeyword(userInput, "hello", 0) >= 0){
			return true;
		}
		
		if(FultonMain.findKeyword(userInput, "hi", 0) >= 0){
			return true;
		}
		
		if(FultonMain.findKeyword(userInput, "hey", 0) >= 0){
			return true;
		}
		return false;
	}
	
}
