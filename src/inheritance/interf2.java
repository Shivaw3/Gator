package inheritance;

interface interf1 {
	
	void add();
}	
	
class subtraction123
{
void sub()
{
	int x,y,z;
	x=50;y=20;
	z=x-y;
	System.out.println(z);
}}

class multiplication123 extends subtraction123 implements interf1
{
 public void add()
 {
	 int x,y,z;x=100;y=20;
        z=x+y;
System.out.println(z);

 }
 void mul()
 {
	 int x,y,z;x=50;y=20;
        z=x*y;
System.out.println(z);}}
	

public class interf2 {

public static void main(String[] args)
{
  multiplication123 m=new multiplication123();
  m.add();
  m.mul();
  m.sub();
}	 }

