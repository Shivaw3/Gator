package constructor;

public class Copycon1 {
double tot;
Copycon1(){
	double m1=10;
	double m2=20;
	double m3=30;
	tot=m1+m2+m3;}
public void show() {
	System.out.println(tot);
}
public static void main(String[] args) {
	Copycon1 a=new Copycon1();
	a.show();
	Copycon1 a1=a;
	a1.show();
}
}
