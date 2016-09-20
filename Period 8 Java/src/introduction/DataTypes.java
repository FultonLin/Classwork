package introduction;

public class DataTypes {

	public static void main(String[] args) {
		System.out.println(5.0/2);
		System.out.println((double)5/2);
		System.out.println(5/2);
		System.out.println(3+5.0/2+5*2);
		System.out.println(3.0+5/2+5*2);
		System.out.println((int)(3.0 + 5)/(2 + 5 * 2));
		String ten = "10";
		String two = "2";
		if(ten.compareTo(two)>0)System.out.println("10 is greater than 2");
		else System.out.println("10 is not greater than 2");
	}

}
