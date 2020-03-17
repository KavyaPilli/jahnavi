package cts;
import java.util.*;

public class Admission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		map.put(2015,201);
		map.put(2016,021);
		map.put(2017,600);
		map.put(2018,726);
		map.put(2019,364);
		System.out.println(map);
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year");
		int se=sc.nextInt();*/
		Set entries=map.entrySet();
		Iterator itr=entries.iterator();
		int max=0,yr=0;
		while(itr.hasNext())
		{
			 
			Map.Entry me=(Map.Entry)itr.next();
			Integer in=(Integer)me.getValue();
			if(in>max)
			{
				max=in;
				yr=(Integer)me.getKey();
			}
			
		}
		System.out.println(yr+" "+max);
	}

}
