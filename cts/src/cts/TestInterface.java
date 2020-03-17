package cts;
@FunctionalInterface
interface Drawing
{
	//public void Draw();//Thiscode is for not return type and no prmtr
	//public void Draw(int a,int b);//Thiscode is for not return type and with prmtr
    public int Draw(int a,int b,int c);
}
/*class Circle implements Drawing
{
	public void Draw()
	{
		System.out.println("Circle");
	}
}*/
public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    /*Circle c=new Circle();
    c.Draw(); this is general process*/
	/*	Drawing circle=()->System.out.println("Circle is drawn);
		circle.Draw();//here circle is an object
This code is for not return type and no prmtr*/		
	/*	Drawing circle=(a,b)->System.out.println("Rectangle area is"+(a*b));//Thiscode is for not return type and with prmtr
		circle.Draw(5,6);*/
		Drawing circle=(a,b,c)->a+b+c;
		
		
		int k = circle.Draw(1,2,3);
		System.out.println(k);
		
	}

}
