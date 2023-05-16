package inheritance;

public class Multi_level {
public void add() {
	int x,y,z;
	x=10;y=20;z=x+y;
	System.out.println(z);
}
}
class substraction extends Multi_level{
	public void sub () {
		int x,y,z;
		x=10;y=20;z=x-y;
		System.out.println(z);
	}
}
class Mult extends substraction{
	public void mul() {
		int x,y,z;
		x=10;y=20;z=x*y;
		System.out.println(z);
	}

}
