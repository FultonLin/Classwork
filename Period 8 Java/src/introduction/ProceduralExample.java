package introduction;

public class ProceduralExample {
  public static void main(String[] args){
	String[] names={"Jillian","Joseph","Jordan"};
	String[] years={"Freshman","Junior","Senior"};
	for(int i = 0; i < 3; i++)
	{
		System.out.println("Hi, my name is " + names[i] + " and I am a " + years[i] + ".");
	}
	System.out.println("Hi, my name is " + names[0] + " and I am a " + years[0] + ".");
	System.out.println("Hi, my name is " + names[1] + " and I am a " + years[1] + ".");
	System.out.println("Hi, my name is " + names[2] + " and I am a " + years[2] + ".");
  }
}