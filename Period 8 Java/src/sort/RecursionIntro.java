package sort;

public class RecursionIntro {

	public static void main(String[] args) {
//		System.out.println("Using a for loop:");
//		for(int i = 0; i < 5; i++){
//			System.out.println("Hello World! x" + i);
//		}
//		System.out.println("Without using a for Loop;");
//		factorial(5);
//		
//		forLoop(5, new Action() {
//			
//			private int value = 0;
//			
//			public void act() {
//				System.out.println("Hello World! x" + value);
//				value++;
//			}
//		});
		
		hanoiSolution(4, "A", "B", "C");
	}
	
	public static void forLoop(int i , Action action){
		if(i <= 0){
			//base case
			return;
		}else{
			//standard action
			action.act();
			//recursive call
			forLoop(i-1, action);
		}
	}
	
	public static int factorial(int x){
//		int current = 1;
//		for(int i = x; i > 0; i--){
//			current = current * i;
//		}
//		System.out.println(current);
//		return current;
		
		if(x > 1){
			return x *factorial(x-1);
		}return 1;
	}
	
	public static void hanoiSolution(int numberOfDiscs, String startPeg, String midPeg, String endPeg){
		if(numberOfDiscs <=1){
			System.out.println("Move " + startPeg + " to " + endPeg);
		}else{
			hanoiSolution(numberOfDiscs-1, startPeg, endPeg, midPeg);
			hanoiSolution(1, startPeg, midPeg, endPeg);
			hanoiSolution(numberOfDiscs-1, midPeg, startPeg, endPeg);
		}
	}
}