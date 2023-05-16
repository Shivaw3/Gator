package functions;

public class Returntype_Noparameter1 {
	public int add() {
		int x=10;
		int y=20;
		int z=x+y;
		System.out.println(z);
		return z;
	}
	public int dub() {
		int x=30;
		int y=40;
		int z=x-y;
		System.out.println(z);
		return z;
	}
	public static void main(String[] args) {
		Returntype_Noparameter1 a=new Returntype_Noparameter1();
		int r=a.add();
		System.out.println("addition:" +r);
		int r1=a.dub();
		System.out.println("subtraction:" +r1);
	}
}
