package employee;
import java.util.*;
class Marks
{
	public HashMap<Integer,Integer> Score(HashMap<Integer,Integer> hm1)
	{
		int max=0;
		Set keys=hm1.keySet();
		HashMap<Integer,Integer> res=new HashMap();
		Iterator itr=keys.iterator();
		while(itr.hasNext())
		{
			int id=(int)itr.next();
			int scr=hm1.get(id);
			if(scr>max)
			{
				max=scr;
				res.put(id,max);
			}
		}
		return res;
	}
	
}
public class UserMainCode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marks s=new Marks();
		 Scanner sc=new Scanner(System.in);
	     System.out.println("Enter no.of employees");
	     int n=sc.nextInt();
	     HashMap<Integer,Integer> hm1=new HashMap<Integer,Integer>();
	     HashMap<Integer,Integer> hm2=new HashMap<Integer,Integer>();
	     for(int i=0;i<n;i++)
	     {
	    	 System.out.println("Enter id:");
	         int id=sc.nextInt();
	         System.out.println("Enter marks:");
	         int marks=sc.nextInt();
	         hm1.put(id,marks);
	     }
	  hm2=s.Score(hm1);
	  System.out.println("result: "+hm2);
	}
}