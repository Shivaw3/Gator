package claas_object;

public class Class_Param {
int x=10;
int y=20;
int z;
public void add() {
	z=x+y;
	System.out.println(z);
}
public static void main(String[] args) {
	Class_Param a=new Class_Param();
	a.x=10;
	a.y=20;
	a.add();
}
}
