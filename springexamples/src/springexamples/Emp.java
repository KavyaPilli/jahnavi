package springexamples;
import java.util.Iterator;

import java.util.Map;

import java.util.Map.Entry;

import java.util.Set;
public class Emp {

	       private int id; 

	       private String name; 

	       private Map<String,String> answers;

	       private Addr addr;

	        

	       public Emp()

	       {

	              System.out.println("def cons");

	       } 

	        

	       public Emp(int id, String name,  Map<String, String> answers,Addr addr) { 

	           super(); 

	           this.id = id; 

	           this.name = name; 

	           this.answers=answers;

	           this.addr = addr; 

	       } 

	        

	       public void Display()

	       { 

	           System.out.println(id+" "+name); 

	           System.out.println(addr.toString());

	           Set<Entry<String, String>> set=answers.entrySet();

	           Iterator<Entry<String, String>> itr=set.iterator();

	         

	           while(itr.hasNext()){

	               Entry<String,String> entry=itr.next();

	               System.out.println(entry.getKey()+" "+ entry.getValue());

	           }

	       } 

	 

	}

	 