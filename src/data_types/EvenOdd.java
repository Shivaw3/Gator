package data_types;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int x;
System.out.println("enter the value");
x=sc.nextInt();
if(x%2==0) {
	System.out.println("even num" +x);
}
else {
	System.out.println("odd number" +x);
}
	}

}
