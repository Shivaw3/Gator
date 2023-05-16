package inheritance;

class substrac {
	public void add() {
		int x,y,z;
		x=10;y=20;z=x+y;
		System.out.println(z);
	}
	}
	class muliii extends substrac{
		public void sub () {
			int x,y,z;
			x=10;y=20;z=x-y;
			System.out.println(z);
		}
	}
		public class Practice extends muliii{
			public void mul() {
				int x,y,z;
				x=20;y=20;z=x*y;
				System.out.println(z);
			}
			public static void main(String[] args) {
				Practice g=new  Practice ();
				 g.add();
				 g.sub();
				 g.mul();
			}
}
