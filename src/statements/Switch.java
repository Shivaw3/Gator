package statements;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int x,y,z;
System.out.println("enter first value");
x=sc.nextInt();
System.out.println("enter second value");
y=sc.nextInt();
System.out.println("select your choice");
z=sc.nextInt();
switch(z) {
case 1:
	System.out.println(x+y);
	break;
case 2:
	System.out.println(x-y);
	break;
case 3:
	System.out.println(x*y);
	break;
case 4:
	System.out.println(x/y);
	break;
	default:
		System.out.println("invalid choice");
}
	}

}
