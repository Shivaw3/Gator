package statements;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int x,y,op;
System.out.println("enter first value");
x=sc.nextInt();
System.out.println("enter secomd value");
y=sc.nextInt();
System.out.println("enter yuor option");
op=sc.nextInt();
switch(op) {
case 1:
	op=x+y;
	System.out.println("additoin" +op);
break;
case 2:
	op=x-y;
	System.out.println("subtraction" +op);
	break;
	default:
		System.out.println("invalid operation");
}
	}

}
