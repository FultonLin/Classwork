package introduction;

import java.util.Scanner;

public class StringPractice {

	static Scanner input;
	static String user;
	
	public static void main(String[] args) {
		 //demonstrateStringMethods();
		 createFields();
		 promptName();
		 promptForever();
	}
	
	public static void promptName() {
		print("Enter your name");
		user = input.nextLine();
		print("Glad to meet you, "+user
				+". For the rest of time, "
				+ "I will call you, "+user
				+". You may call me Computer. "
				+ "We should become friends.");
	}

	public static void promptForever() {
		while(true){
			promptInput();
		}
	}

	public static void promptInput(){
		print("Please type something.");
		String userInput = input.nextLine();
		print("Congratulations! You typed: "+userInput);
	}
	
	public static void createFields(){
		input = new Scanner(System.in);
		user = "";
	}
	
	public static void demonstrateStringMethods(){
		String text1 = new String("Hello World");
		String text2 = "Hello World";//Same as above

		if(text1.equals(text2)){//instead of using == use .equals
			System.out.println("These strings are equal:");
		}
		
		print(text1);
		print(text2);
		
		String word1 = "Aardvark";
		String word2 = "Zyzzyva";
		
		if(word1.compareTo(word2) < 0){
			print("word1 comes before word2");
		}
	}
		
	public static void print(String s){
		String printString = s;
		int cutoff = 45;
		if(printString.length() > cutoff){
			int cut = 1;
			int cutIndex = cut = cutoff;
			String currentCut = s.substring(0, cutIndex);
			printString = currentCut;
		}
		System.out.println(printString);
	}
}
