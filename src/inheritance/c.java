package inheritance;

class Multiple {
int a=10;
int b=20;
public void m1() {
	System.out.println("super class");
}
}
class z extends Multiple{
	public void m2() {
		int a1,b1;
		a1=20;b1=30;
		System.out.println("sub class");
		System.out.println(a+b);
	}
}
public class c extends z{
	public void m3() {
		int a1,b1;
		a1=20;b1=30;
		System.out.println("child class");
		System.out.println(a1-b1);
		System.out.println(a+b);
	}

public static void main(String[] args) {
		c ob=new c();
		ob.m1();
		ob.m2();
		ob.m3();
		
	}
}
