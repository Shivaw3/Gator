package core_java_practice2;

public class instancevariables {
	int x=10;
	int y=20;
	public void sub() {
		int z=x-y;
		System.out.println(z);
	}
public void add() {
	int z=x+y;
	System.out.println(z);
}
public void mul() {
	int z=x*y;
	System.out.println(z);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
instancevariables pub = new instancevariables();
pub.sub();
pub.add();
pub.mul();
	}

}
