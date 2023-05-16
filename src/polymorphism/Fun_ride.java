package polymorphism;

public class Fun_ride {
	void add(int x, int y)
	{
		System.out.println(+(x+y));
		
	}

	
	void add(String a, String b)
	{
		String c=a+b;
		System.out.println(c);
		
	}
public static void main(String[] args)

{
	Fun_ride_m a1=new Fun_ride_m();
	a1.add();
	a1.add("testing");
	a1.add(12.000, 12.0000);
	a1.add(12,23);
	a1.add("testing ","tools");
	
	Fun_ride a2=new Fun_ride();
	a2.add(12, 23);
	a2.add("manual","testing");
	



}

}
