package exceptionhandling;

import java.util.Scanner;

public class Finally_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
Scanner sc=new Scanner(System.in);
int a,b,c;
System.out.println("enter first value");
b=sc.nextInt();
System.out.println("enter second value");
c=sc.nextInt();
if(c!=0) {
	a=b/c;
	System.out.println(a);
}

throw new Exception("no");
}
catch(Exception e) {
	System.out.println(e);
}
	}
}

