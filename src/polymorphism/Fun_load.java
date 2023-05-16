package polymorphism;

public class Fun_load {
void add() {
	System.out.println("null parameter");
}
void add(int x, int y) {
	System.out.println(x+y);
}
void add(String a, String b) {
	System.out.println(a+b);
}
void add(String c) {
	System.out.println(c);
}
void add(double c, double d) {
	System.out.println(c+d);
}
public static void main(String[] args) {
	Fun_load n= new Fun_load();
	n.add();
	n.add(12,13);
	n.add("testing","tools");
	n.add(12.000,13.000);
	n.add("testing");
}
}
