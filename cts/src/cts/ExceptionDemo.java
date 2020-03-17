package cts;
import java.util.Scanner;
public class ExceptionDemo {
public void divison(int e,int f)
{
	int h=e/f;
	  System.out.println("The quotient is :"+h);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int e,f,h;
  Scanner sc=new Scanner(System.in);
  ExceptionDemo ed=new ExceptionDemo();
  try
  {
	  System.out.println("Enter e,f");
	  e=sc.nextInt();
	  f=sc.nextInt();
	  ed.divison(e,f);
  }
  catch(ArithmeticException obj)
  {
	  System.out.println("ArithmeticException :"+obj);
  }
 
	}

}
