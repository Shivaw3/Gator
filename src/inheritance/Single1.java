package inheritance;

public class Single1 {
public void add() {
	int x,y,z;
	x=10;
	y=20;
	z=x+y;
	System.out.println(z);
}
}
class a extends Single1{
	public void sub() {
		int x,y,z;
		x=20;
		y=39;
		z=x-y;
		System.out.println(z);
	}
}
