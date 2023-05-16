package polymorphism;

public class Fun_ride_m {
	void add()
	{
		System.out.println("null paramters");
	}
		void add(int x, int y)
		{
			System.out.println(+(x+y));
			
		}

		
		void add(String a, String b)
		{
			String c=a+b;
			System.out.println(c);
			
		}
		void add(String c)
		{
			System.out.println(c);
		}
		void add(double c, double d)
		{
			System.out.println(+(c+d));
			
		}
		public static void main(String[] args)
		{
			Fun_ride_m a1=new  Fun_ride_m();
			 a1.add();
			 a1.add(12,23);
			 a1.add("testing","tools");
			a1.add(12.0000,12.0000);
			a1.add("testing");
				
		}

}
