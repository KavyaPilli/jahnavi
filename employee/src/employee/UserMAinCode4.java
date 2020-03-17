package employee;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UserMAinCode4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Map<Integer,Integer> tmap = new TreeMap<Integer,Integer>();
		System.out.println("Enter n value");
		int n=sc.nextInt();
		 for(int i=0;i<n;i++)
	     {
	    	 System.out.println("Enter id:");
	         int id=sc.nextInt();
	         System.out.println("Enter marks:");
	         int marks=sc.nextInt();
	         tmap.put(id,marks);
	     }
		 
	}

}
