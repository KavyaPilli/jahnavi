package employee;
import java.util.*;

public class UserMainCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Hike h=new Hike();
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter no.of employees");
     int n=sc.nextInt();
     HashMap<Integer,String> hm1=new HashMap<Integer,String>();
     HashMap<Integer,Integer> hm2=new HashMap<Integer,Integer>();

     for(int i=0;i<n;i++)
     {
    	 System.out.println("Enter id:");
         int id=sc.nextInt();
         System.out.println("Enter designation");
         String desig=sc.next();
         System.out.println("Enter Salary:");
         int salary=sc.nextInt();
         hm1.put(id,desig);
         hm2.put(id,salary);
     }
     
     HashMap<Integer,Integer> r=new HashMap<Integer,Integer>();
     r=h.increaseSalaries(hm1,hm2);

       System.out.println("result :"+r);
}
}
