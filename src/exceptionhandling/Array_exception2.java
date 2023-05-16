package exceptionhandling;

public class Array_exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
		int a[]= new int[4];
a[0]=10;
a[1]=20;
a[2]=30;
a[3]=40;
a[4]=50;
System.out.println(a.length);
for(int i=0; i<a.length; i++) {
	System.out.println(a[i]);
}
}
catch(Exception e) {
	System.out.println(e);
}
	}
	
}
