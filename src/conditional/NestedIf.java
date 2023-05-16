package conditional;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=30;
int b=45;
if(a==30) {
	if(b==40) {
		System.out.println("a value is 30 and b value 40");
	}
	else {
		System.out.println("second else executed");
	}
}
else {
	System.out.println("first else executed");
}
	}

}
