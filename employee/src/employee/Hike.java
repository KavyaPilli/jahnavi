package employee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Hike{
	public HashMap<Integer,Integer> increaseSalaries(HashMap<Integer,String> hm1,HashMap<Integer,Integer> hm2)
	{
		Set keys=hm1.keySet();
		HashMap<Integer,Integer> res=new HashMap();
		Iterator itr=keys.iterator();
		while(itr.hasNext())
		{
int id=(int)itr.next();
String s=hm1.get(id);
if(s.equals("manager"))
{
	int newsal=hm2.get(id)+5000;
	res.put(id,newsal);
}
			
	}
 return res;
	}
}