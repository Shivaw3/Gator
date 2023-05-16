package constructor;

public class Copycon {
int height;
int width;
int area;
Copycon(int height,int width){
	area=height*width;}
	public void show() {
	System.out.println(area);
}
public static void main(String[] args) {
	Copycon a=new Copycon(10,20);
	a.show();
	Copycon a1=a;
	a1.show();
}
}
