package core_java_practice3;
import java.util.Scanner;
public class scan {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int x,y,z;

System.out.println("enter the first value");
x=sc.nextInt();
System.out.println("the value which u entered is :" +x);


System.out.println("enter the second value");
y=sc.nextInt();
System.out.println("the value which u entered is :" +y);

z=x+y;
System.out.println("the sum of x and y are "+z);
	}
}
