package core_java_practice3;
import java.util.Scanner;
public class Scanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
String x,y,z;
System.out.println("enter first name");
x=sc.next();
System.out.println("the name entered is:" +x);
System.out.println("enter second name");
y=sc.next();
System.out.println("the name entered is: +y");
z=x+y;
System.out.println("the name which you enterd:" +z);
	}

}
