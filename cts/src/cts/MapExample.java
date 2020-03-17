package cts;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;



public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm =new HashMap();
		Object rest=hm.put("k1","India");
		hm.put("k1", "India");
		hm.put("k2", "china");
		hm.put("k3", "pak");
		hm.put("k4", "uk");
		hm.put("k5", "India");
		hm.put("k1", "canada");
		Object obj=hm.putIfAbsent("k1","america");
		System.out.println(rest);
		System.out.println(hm);
	Object r=hm.remove("k2");
	System.out.println(hm);
	Set keys=hm.keySet();
	System.out.println(keys);
	Iterator itr=keys.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	Set entries=hm.entrySet();
	Iterator itr1=entries.iterator();
	while(itr1.hasNext())
	{
		Map.Entry me=(Map.Entry)itr1.next();
		System.out.println(me.getKey()+"  "+me.getValue());
	}
	}

}


