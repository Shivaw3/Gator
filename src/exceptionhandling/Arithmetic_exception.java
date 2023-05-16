package exceptionhandling;

public class Arithmetic_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int a,b;
	a=10;
	b=0;
	System.out.println(a/b);
}
catch(Exception e) {
	System.out.println(e);
}
	}

}
