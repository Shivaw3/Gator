package inheritance;

public class Hierarcical {
public void add() {
	int x,y,z;
	x=10;y=20;z=x+y;
	System.out.println(z);
}
}
class subtract extends Hierarcical{
	public void sub() {
		int x,y,z;
		x=10;y=20;z=x-y;
		System.out.println(z);
	}
}
class multiplix extends Hierarcical{
	public void mul() {
		int x,y,z;
		x=10;y=20;z=x*y;
		System.out.println(z);
	}
}
