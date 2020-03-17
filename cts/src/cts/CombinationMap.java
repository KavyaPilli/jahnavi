package cts;
import java.util.*;
public class CombinationMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar=new ArrayList();
		ar.add("Java");
		ar.add("testing");
		ar.add("oracle");
		
		HashSet hs=new HashSet();
		hs.add("India");
		hs.add("china");
		hs.add("japan");
		
		PriorityQueue pq= new PriorityQueue();
		pq.add("apple");
	    pq.add("orange");
	    pq.add("mango");
	
	   Map<String,Collection> map =new HashMap<String,Collection>();
	  
	   map.put("List",ar);
	   map.put("Set",hs);
	   map.put("Queue",pq);
		Set entries=map.entrySet();
		Iterator itr1=entries.iterator();
		
		while(itr1.hasNext())
		{
			Map.Entry me=(Map.Entry)itr1.next();
		    System.out.println(me.getKey()+" "+me.getValue());
		
		}
	}

}
