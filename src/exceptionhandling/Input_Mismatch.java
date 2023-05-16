package exceptionhandling;

import java.util.Scanner;

public class Input_Mismatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
Scanner sc=new Scanner(System.in);
int age;
System.out.println("enter age");
age=sc.nextInt();
System.out.println("age is:" +age);
	}
catch(Exception e) {
	System.out.println(e);
}
}
}