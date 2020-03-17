package cts;

public class Area {

 public Area(int s)
 {
	s=s*s;
	System.out.println("Area of square"+s);
 }
 public Area(int l,int b)
 {
	l=l*b;
	System.out.println("Area of rectangle"+l);
 }
 public Area(int a,int b,int c)
 {
	a=a+b+c;
	System.out.println("Area of square"+a);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area ar1=new Area(5);
		Area ar2=new Area(10,20);
		Area ar3=new Area(5,10,15);


	}

}
