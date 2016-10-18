package arrays;
/**Primitive type[]
 * primitive types are "already" in the system, start as zero 
 * cannot mix types
 * 
 * Object[]
 * unless initialized start as null
 * different types of objects in an array of common superclass
 *
 */
public class ArraysPractice {
	
	static boolean[] boos3;
	
	public static void main(String[] args) {
		//how do you time a process?
		long currentTime = System.currentTimeMillis();
		int diceNumber = 4;
		
		int[] fiftyNumbers = new int[50000];
//		populate(fiftyNumbers);
//		printInt(fiftyNumbers);
//		randomize(fiftyNumbers,50);
//		printInt(fiftyNumbers);
		rollDice(fiftyNumbers,diceNumber);
//		//count each die roll and provide a percentage
		countResult(fiftyNumbers,diceNumber);
		
		
		long endTime = System.currentTimeMillis();
		System.out.println("The process took " + (endTime-currentTime) + "ms." );
	}
	
	private static void countResult(int[] s,int numberOfDice) {
		int[] numbers = new int[numberOfDice*6];
		for(int n: s){
			numbers[n-1] = numbers[n-1] + 1;
		}
		for(int i = numberOfDice-1; i < numbers.length; i++){
			System.out.println((i+1) + " was rolled "+ 100*numbers[i]/s.length + "%");
		}
	}

	private static void rollDice(int[] s, int numberOfDice) {
		for(int i = 0; i < s.length; i++){
			int dice = 0;
			for(int j = 0; j < numberOfDice; j++){
				dice = dice + (int) (1+6*Math.random());
			}
			s[i] = dice;
		}
	}

	

	@SuppressWarnings("unused")
	private static void randomize(int[] s, int max) {
		for(int i = 0; i < s.length; i++){
			s[i] = 1+(int)(max*Math.random());
		}
	}

	@SuppressWarnings("unused")
	private static void populate(int[] s) {
		for(int i = 0; i < s.length; i++){
			s[i] = i+1;
		}
	}

	private static void printInt(int[]s){
		for(int i = 0; i < s.length; i++){
			System.out.println(s[i]);
		}
	}
	
	
	
	
	
	
	@SuppressWarnings("unused")
	private void demonstratePassByValue(){
		String[] someStrings = new String[1000];
		standardPopulate(someStrings);
		String s =someStrings[999];
		makeSpecial(s);
		someStrings[999] = getASpecialString();
		print(someStrings);
		
//		initializingArraysExample();
	}
	
	private static String getASpecialString() {
		return "THIS STRING IS SPECIAL";
	}

	private static void makeSpecial(String s) {
		s = "THIS STRING IS SPECIAL!";
	}

	private static void print(String[] s){
		for(int i = 0; i < s.length; i++){
			System.out.println(s[i]);
		}
	}
	
	private static void standardPopulate(String[] s) {
		for(int i = 0; i < s.length; i++){
			s[i] = "String #"+(i+1);
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void initializingArraysExample(){
		//If you want to put different primitive types into an array, you must use their wrapper class
		
		//two different ways to instantiate an array
		boolean[] boos1 = new boolean[3];
		//this can ONLY be done at the declaration because it sets size AND content
		@SuppressWarnings("unused")
		boolean[] boos2 = {false,false,false}; 
		//this does NOT work
		//boos3 = {false,false,false};
		//this is all that will work;
		boos3 = new boolean [3];
		
		//2 ways of iterating through an array
		//STANDARD FOR LOOP
		// - the index is important to keep track of
		// - you need to customize the order
		for(int i = 0; i < boos1.length; i++){
			System.out.println(boos1[i]);
		}
		
		//"FOR - EACH" LOOP
		//     - the index is not important
		//     - you don't need to customize
		//     - automatically assigns a "handle"
		//     - faster
		for(boolean b: boos1){
			System.out.println(b);
		}
		
		//OBJECT ARRAYS
		@SuppressWarnings("unused")
		String[] someStrings2 = {"a","b","c"};
		String[] someStrings1 = new String[3];
		//you can do this to instantiate the elements...
//		someStrings1[0] = "a";
//		someStrings1[1] = "b";
//		someStrings1[2] = "c";
		//..but it is repetitive
		
		//let's try a loop to instantiate:
		for(int i = 0; i < someStrings1.length; i++){
			someStrings1[i] = "a new String";
		}
		//a loop to print it:
		for(String s: someStrings1){
			System.out.println(s);
			//String a = s.substring(0);
			//System.out.println(a);
		}
	}
}