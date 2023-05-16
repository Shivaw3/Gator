package functions;

public class Functions1 {
public void add() {
	int x,y,z;
	x=10;
	y=20;
	z=x+y;
	System.out.println(z);
}
public void sub() {
	int x=10;
	int y=20;
	int z=x-y;
	System.out.println(z);
}
public static void main(String[] args) {
	Functions1 a=new Functions1();
	a.add();
	a.sub();
}
}
