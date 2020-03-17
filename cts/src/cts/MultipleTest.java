package cts;
import  java.util.Scanner;
public class MultipleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n to find finnanocci value");
		int n=sc.nextInt();
		Test1 t=new Test1();
		int r=t.fib(n);
		System.out.println(r);
		System.out.println("Enter p to find prime or not");
		int p=sc.nextInt();
		t.primeCheck(p);
	}

}
