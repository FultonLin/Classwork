package introduction;

public class RandomDiceRoll {

	public static void main(String[] args) {
		int[] results = new int[6];
		
		//declare variable, logic test, increment
		int totalRolls = 10000;
		for(int index = 0; index < totalRolls; index ++){
			int result = rollUnfairDie();
			System.out.println("Roll #"+(index+1)+": "+result);
			results[result-1] ++;
		}
		for(int i = 0; i <6; i++){
			System.out.println((i+1)+" appeared "+results[i]+" times.");
		}
	}
	
	//return 1,2,3,4,5,6 with equal probability
	public static int rollFairDie(){
		double rand = Math.random();//returns a double between 0 and 1
		int roll = (int) (6*rand);//including 0 to 5
		roll++;//includes 1-6
		return roll;
	}
	
	public static int rollUnfairDie(){
		double rand = Math.random();
		int second = (int) (6*rand);
		int roll = (int) (6*rand);
		roll++;
		if(roll == second && roll != 6)
		{
			roll++;
		}
		return roll;
	}
}