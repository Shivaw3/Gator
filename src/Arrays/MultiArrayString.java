package Arrays;

public class MultiArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a[][]=new String[2][2];
a[0][0]="testing";
a[0][1]="devops";
a[1][0]="cloud";
a[1][1]="python";
System.out.println(a.length);
for(int i=0;i<a.length;i++) {
	for(int j=0;j<a.length;j++) {
	System.out.println(a[i][j]);
	}
}
	}

}
