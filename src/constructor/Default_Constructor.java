package constructor;

public class Default_Constructor {
int height;
int width;
int area;
Default_Constructor(){
	height=12;
	width=23;
	area=height*width;
System.out.println(area);	
}
public static void main(String[] args) {
	Default_Constructor a=new Default_Constructor();
}
}
