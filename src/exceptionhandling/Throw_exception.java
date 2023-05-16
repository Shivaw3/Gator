package exceptionhandling;

public class Throw_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int a=10;
		int b=0;
		if(b!=0) {
			System.out.println(a/b);
		}
		else {
			throw new Exception("don't divided by zero");
		}
	}
catch(Exception e) {
	System.out.println(e);
}
}
}