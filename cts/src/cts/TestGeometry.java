package cts;
abstract class Geometry
{  
 abstract public void Area();
 
}
class Square extends Geometry
{
 int s=5;
   public void Area()
 {
  System.out.println("Area is "+s*s);
 }
}
class Rectangle extends Geometry
{
	int l=6,b=7;
	   public void Area()
	   {
	    System.out.println("Area is "+l*b);
	   }
}
public class TestGeometry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Square sq=new Square();
		 sq.Area();
		Rectangle rt=new Rectangle();
		rt.Area();
	}

}
