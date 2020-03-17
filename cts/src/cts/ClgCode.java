package cts;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

import java.util.Scanner;
class Cgroups
{
	String dept1;
	String dept2;
	String dept3;
	Cgroups(String dept1,String dept2,String dept3)
	{
	  this.dept1=dept1;
	  this.dept2=dept2;
	  this.dept3=dept3;
	}
	@Override
	public String toString() {
		return "Cgroups [dept1=" + dept1 + ", dept2=" + dept2 + ", dept3=" + dept3 + "]";
	}
	
}
public class ClgCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String,Cgroups> map=new HashMap<String,Cgroups>();
Cgroups c1=new Cgroups("CSE","EEE","ECE");
Cgroups c2=new Cgroups("CSE","CIVIL","MECH");
Cgroups c3=new Cgroups("IT","ECE","CIVIL");
map.put("JNTU",c1);
map.put("SVU",c2);
map.put("OU",c3);
//System.out.println(map);
Scanner sc=new Scanner(System.in);
System.out.println("Enter a group name");
String se=sc.nextLine();
Set entries=map.entrySet();
Iterator itr=entries.iterator();
while(itr.hasNext())
{
	Map.Entry me=(Map.Entry)itr.next();
	Cgroups c=(Cgroups)me.getValue();
	//System.out.println(c);
	if(se.equals(c.dept1))
	{
		System.out.println(me.getKey()+" "+c.dept1);
	}
	else if(se.equals(c.dept2)) {
		System.out.println(me.getKey()+" "+c.dept2);
	}
	else if(se.equals(c.dept3))
	{
		System.out.println(me.getKey()+" "+c.dept3);
	}
	
}

	}

}
