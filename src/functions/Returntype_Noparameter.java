package functions;

public class Returntype_Noparameter {
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
	Returntype_Noparameter a=new Returntype_Noparameter();
	  a.add();
      a.dub();
}
}
