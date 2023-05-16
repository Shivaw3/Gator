package inheritance;

	public interface Interf {
		
		void add();
}	
		
class subtraction
{
	void sub()
	{
		int x,y,z;
		x=10;y=20;
		z=x-y;
		System.out.println(z);
	}
	}
 
  class multiplication extends subtraction implements Interf
  {
	 public void add()
	 {
		 int x,y,z;x=20;y=20;
	        z=x+y;
	System.out.println(z);
	
	 }
	 void mul()
	 {
		 int x,y,z;x=25;y=20;
	        z=x*y;
	System.out.println(z);
		 
	 }
  }
  
	 
  

  
  
