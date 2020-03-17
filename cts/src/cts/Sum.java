package cts;
import java.util.Scanner;
 class Eliminate
{
	public void add(int x,int y,int z)
	{
		if((x==13)&&(y==13)&&(z==13))
		{
			
			System.out.println("0 ");
		}
		else if((x==13)&&(y!=13)&&(z!=13))
		{
			System.out.println("Addition is "+z);
		}
		else if((x!=13)&&(y==13)&&(z!=13))
		{
			System.out.println("Addition is "+x);
		}
		else if((x!=13)&&(y!=13)&&(z==13))
		{
			System.out.println("Addition is "+(x+y));
		}
	}
}
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a value");
   int a=sc.nextInt();
   System.out.println("Enter b value");
   int b=sc.nextInt();
   System.out.println("Enter c value");
   int c=sc.nextInt();
   Eliminate e=new Eliminate();
  e.add(a,b,c);
   
	}

}
