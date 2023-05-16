package constructor;

import java.util.Scanner;

public class Reverse {
String str;
Scanner sc=new Scanner(System.in);
Reverse(){
	System.out.println("enter a string");
	str=sc.nextLine();
	for(int i=str.length()-1;i>=0;i--) {
		System.out.print(str.charAt(i));
	}
	}
	public static void main(String[] args) {
		Reverse a=new Reverse();
	
}
}
