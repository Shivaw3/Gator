package constructor;

public class Copy {
int a;
int b;
int c;
Copy(int a, int b){
	c=a+b;
}
public void add() {
	System.out.println(c);
}
public static void main(String[] args) {
	Copy a1=new Copy(10,20);
	a1.add();
	Copy a2=a1;
	a2.add();
	
}
}
