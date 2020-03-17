package employee;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
class Score{
	public void Sort(TreeMap<Integer,Integer> hm1)
	{
		int c=0;
        Set set = hm1.entrySet(); 
        Iterator i = set.iterator(); 
        while (i.hasNext()) { 
        	
            Map.Entry me = (Map.Entry)i.next(); 
            System.out.print(me.getKey() + ": "); 
            System.out.println(me.getValue()); 
            int mrks=(Integer)me.getValue();
            
        }
	}
}
public class UserMainCode3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score s=new Score();
		 Scanner sc=new Scanner(System.in);
	     System.out.println("Enter no.of employees");
	     int n=sc.nextInt();
	     Map<Integer,Integer> treemap = new TreeMap<Integer,Integer>(Collections.reverseOrder()); 
	    // Map<Integer,Integer> hm2=new TreeMap<Integer,Integer>();
	     for(int i=0;i<n;i++)
	     {
	    	 System.out.println("Enter id:");
	         int id=sc.nextInt();
	         System.out.println("Enter marks:");
	         int marks=sc.nextInt();
	         treemap.put(id,marks);
	     }
	 s.Sort((TreeMap<Integer, Integer>) treemap);
	}

}
