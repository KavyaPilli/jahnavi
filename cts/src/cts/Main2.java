package cts;
import java.util.Scanner;
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("enter x cofficient");
    float x=sc.nextFloat();
    System.out.println("enter y cofficient");
    float y=sc.nextFloat();
    System.out.println("enter z cofficient");
    float z=sc.nextFloat();
    System.out.println(UserMainCode2.findRoots(x,y,z));
	}

}
