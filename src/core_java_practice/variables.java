package core_java_practice;

public class variables {
int b=20;  // instance variable
static int c=200; // static variable
public void m1() {
	int a=10;  // local variable
	System.out.println("m1 executed");
	System.out.println(a + "local variable");
}
public void m2() {
	System.out.println("m2 executed");
	System.out.println(b + "instance variable");
	System.out.println(c + "static variable");
}
public static void st () {
	System.out.println("static method executed");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main method executed");
variables m3 = new variables();
m3.m1();
m3.m2();
variables.st();
	}

}
