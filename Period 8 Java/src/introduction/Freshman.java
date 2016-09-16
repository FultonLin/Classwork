package introduction;

public class Freshman extends Student {

	public Freshman(String name) {
		super(name);
	}
	
	public void talk(){
		super.talk();
		System.out.println(" and I am a freshman. And how do you get here.");
	}

}
