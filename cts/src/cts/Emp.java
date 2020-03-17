package cts;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Emp 
{
String Name;
String designation;
float Sal;
String city;
Emp(String Name,String designation,float Sal,String city)
{
	this.Name=Name;
	this.designation=designation;
	this.Sal=Sal;
	this.city=city;
}
	@Override
public String toString() {
	return "Emp [Name=" + Name + ", designation=" + designation + ", Sal=" + Sal + ", city=" + city + "]";
}
	public boolean equals(Object obj)
	{
		Emp e=(Emp)obj;
	if((Name.equals(e.Name))&&(designation.equals(e.designation))&&(Sal==(e.Sal))&&(city.equals(e.city)))
	{
		return true;
	}
	else
	{
		return false;
	}
	}
	public static void display(Predicate<Emp> p,ArrayList<Emp> list)
	{
		for(Emp e:list)
		{
			if(p.test(e))
			{
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args)
	{
		
Emp e1=new Emp("kavya","trainee",20000,"hyd");
Emp e2=new Emp("yamini","ce0",50000,"hyd");
Emp e3=new Emp("jan","manager",20000,"coi");
Emp e4=new Emp("anuja","ceo",20000,"chennai");
Emp e5=new Emp("nissie","manager",20000,"bang");
Emp e6=new Emp("anil","developer",10000,"hyd");
Emp e7=new Emp("karuna","developer",10000,"hyd");
Emp e8=new Emp("sunil","developer",10000,"bang");

Predicate<Emp> p1=empl->empl.designation.equals("manager");

Predicate<Emp> p2=empl->empl.city.equals("hyd");
Predicate<Emp> p3=empl->empl.Sal<15000;
ArrayList<Emp> list=new ArrayList<Emp>();
list.add(e1);
list.add(e2);
list.add(e3);
list.add(e4);
list.add(e5);
list.add(e6);
list.add(e7);
list.add(e8);
display(p2.and(p3),list);

System.out.println(e2);

if(e1.equals(e2))
	System.out.println("Equal");
else
	System.out.println("not Equal");
	}
	

}
