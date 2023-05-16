package data_types;

import java.util.Scanner;

public class AverageOfFiveSubjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a1,a2,a3,a4,a5,tot;
double per;
System.out.println("enter a1 marks");
a1=sc.nextInt();
System.out.println("a1 marks is:" +a1);

System.out.println("enter a2 marks");
a2=sc.nextInt();
System.out.println("a2 marks is:" +a2);

System.out.println("enter a3 marks");
a3=sc.nextInt();
System.out.println("a3 marks is:" +a3);

System.out.println("enter a4 marks");
a4=sc.nextInt();
System.out.println("a4 marks is:" +a4);

System.out.println("enter a5 marks");
a5=sc.nextInt();
System.out.println("a5 marks is:" +a5);

tot=a1+a2+a3+a4+a5;
System.out.println("total:" +tot);

per=tot/5;
System.out.println("percentage:" +per);
}

}
