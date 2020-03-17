package cts;
import java.util.Scanner;
public class EvenOddTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int a=sc.nextInt();
		TestNumber tn=new TestNumber();
		try {
			tn.TstNum(a);
		} 
		catch (OddNumberException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		catch (EvenNumberException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
