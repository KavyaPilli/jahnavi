package cts;
public class FirstDemoOne extends FirstInter.One implements InnerDemo.One{
public void greater(int e,int f)
{
	int h;
	h=(e>f)?e:f;
	System.out.println("Greater is "+h);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 FirstDemoOne obj=new FirstDemoOne();
   obj.display();
   obj.greater(11,33);
	}

}
