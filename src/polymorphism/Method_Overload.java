package polymorphism;

public class Method_Overload {
public void add(int a, int b) {
	System.out.println(a+b);
}
public void add(int a, int b, int c) {
	System.out.println(a+b+c);
}
public static void main(String[] args) {
	Method_Overload a=new Method_Overload();
	a.add(10,20);
	a.add(30,40,50);
}
}
