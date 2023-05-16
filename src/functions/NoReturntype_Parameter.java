package functions;

public class NoReturntype_Parameter {
public void add(int x, int y) {
	int z=x+y;
	System.out.println(z);
}
public void sub(int x, int y) {
	int z=x-y;
	System.out.println(z);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoReturntype_Parameter a=new NoReturntype_Parameter();
		a.add(10,20);
		a.sub(20,10);
	}

}
