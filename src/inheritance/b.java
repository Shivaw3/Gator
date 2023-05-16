package inheritance;

class Single{
public void a() {
	System.out.println("hai....");
	System.out.println("super class");
}
}
public class b extends Single{
	public static void main(String[] args) {
		b s=new b();
		s.a();
		
	}
}
