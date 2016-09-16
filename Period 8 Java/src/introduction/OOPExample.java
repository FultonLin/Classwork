package introduction;

public class OOPExample {

	public static void main(String[] args) {
		Student jillian = new Senior("Jillian");
		Student jordan = new Freshman("Jordan");
		Student joseph = new Sophomore("Joseph", "hobby");

		jillian.talk();
		jordan.talk();
		joseph.talk();
		((Sophomore)joseph).savHobby();
	}

}