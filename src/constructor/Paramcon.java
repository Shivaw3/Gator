package constructor;

public class Paramcon {
int height;
int width;
int area;
Paramcon(int height,int width){
	area=height*width;
	System.out.println(area);
}
public static void main(String[] args) {
	Paramcon a=new Paramcon(12,23);
}
}
