package functions;

public class Returntype_With_Parameter {
public int add(int x, int y) {
	int z=x+y;
	System.out.println(z);
	return z;
}
public int sub(int x, int y) {
	int z=x-y;
	System.out.println(z);
	return z;
}
public static void main(String[] args) {
	Returntype_With_Parameter a=new Returntype_With_Parameter();
	a.add(10,20);
	a.sub(20,10);
}
}
