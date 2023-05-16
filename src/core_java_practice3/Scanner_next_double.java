package core_java_practice3;
import java.util.Scanner;

public class Scanner_next_double {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double x,y,z;
		System.out.println("enter first marks");
		x=sc.nextDouble();
		System.out.println("the marks you entered is :" +x);
		System.out.println("enetr second marks");
		y=sc.nextDouble();
		System.out.println("the marks you entered is" +y);
		z=x+y;
		System.out.println("total marks is:" +z);
	}

}
