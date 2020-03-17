package cts;
import java.util.*;
public class CapitalSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map=new HashMap();
		ArrayList<String> ar=new ArrayList<String>();
		map.put(101,"AnujA");
		map.put(102,"Nissi");
		map.put(103,"kavyA");
		map.put(104, "veena");
		map.put(105, "KRISHNA");
		System.out.println(map);
		Set entries=map.entrySet();
		Iterator itr=entries.iterator();
		while(itr.hasNext())
		{
			 
			Map.Entry me=(Map.Entry)itr.next();
			//System.out.println(me.getKey()+" "+me.getValue());
			String str=(String)me.getValue();
			
			if((str.charAt(0)>=97) && (str.charAt(0)<=123) && (str.charAt(str.length()-1)>=65)  && (str.charAt(str.length()-1)<=96))
			{
				 ar.add(str);
			}
			
		}
		
		for(String c:ar)
		System.out.println(c);
		}
	}

