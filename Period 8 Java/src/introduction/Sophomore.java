package introduction;

public class Sophomore extends Student {
	private String hobby;
	
	public Sophomore(String name, String hobby) {
		super(name);
	}
	
	public void talk(){
		super.talk();
		System.out.println("I am a Sophormore.");
	}
	
	public void favHobby(){
		System.out.println("");
	}
}
