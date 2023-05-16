package data_types;

import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int x;
System.out.println("enter a value");
	x=sc.nextInt();
	if(x<0) {
		System.out.println("given value is negative");
}
	else if(x>0) {
		System.out.println("given value is positive");
	}
	else {
		System.out.println("zero");
	}
	}

}
