package core_java_practice;

public class sample3 {
public void m1() {
	System.out.println("m1 executed");
}
public void m2() {
	System.out.println("m2 executed");
}
public void m3() {
	System.out.println("m3 executed");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main method executed");
//classname   object   ==   new classname
sample3 m4=new sample3();
m4.m1();
m4.m2();
m4.m3();
	}

}
