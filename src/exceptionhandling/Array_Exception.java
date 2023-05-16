package exceptionhandling;

public class Array_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
int a[]=new int[4];
a[0]=10;
a[1]=20;
a[2]=30;
a[3]=40;
System.out.println(a[5]);
	}
catch (Exception e) {
	System.out.println(e);
}
}
}