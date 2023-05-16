package polymorphism;

public class Over_Ride extends Method_Overload {
public void add(int a, int b) {
	System.out.println(a-b);
}
public void add(String a,String b) {
	System.out.println(a+b);
}
public static void main(String[] args) {
	Over_Ride a1=new Over_Ride();
	a1.add(10,20);
	a1.add("testing","tools");
}
}
