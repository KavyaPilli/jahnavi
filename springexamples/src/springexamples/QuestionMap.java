package springexamples;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class QuestionMap {
	private int id;
	private String name;
	private Map<String,String> AnsMap;
	public QuestionMap(int id,String name,Map<String,String> AnsMap)
	{
	super();
	this.id=id;
	this.name=name;
	this.AnsMap=AnsMap;
	}
	public void Display()
	{
		System.out.println("qustion id: "+id);
		System.out.println("question name: "+name);
		System.out.println("answers are:");
		  // Set<Entry<String, String>> set=AnsMap.entrySet();  
		    //Iterator<Entry<String, String>> itr=set.iterator();  
		Set keys=AnsMap.entrySet();
		Iterator itr=keys.iterator();
		
		while(itr.hasNext()){  
		       // Entry<String,String> entry=itr.next();  
		    Map.Entry entry=(Map.Entry)itr.next();    
			System.out.println("Answer:"+entry.getKey()+" Posted By:"+entry.getValue());  
		    }  
	}
}
