package claas_object;

public class Sample_Class {
int x=10;
int y=20;
int z;
public void add() {
	z=x+y;
	System.out.println(z);
}
public static void main(String[] args) {
	Sample_Class a=new Sample_Class();
	a.add();
}
}
