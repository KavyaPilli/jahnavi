package cts;

import java.util.HashSet;
class emp1
{
	String eid;
	String ename;
	emp1(String id,String name)
	{
		super();
		this.eid=id;
		this.ename=name;
	}
	@Override
	public String toString() {
		return "emp1 [eid=" + eid + ", ename=" + ename + "]";
	}
	
}
public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet hs=new HashSet();
hs.add("India");
hs.add("china");
hs.add(null);
hs.add("japan");
System.out.println(hs);
HashSet hs1=new HashSet();

hs1.add(new emp1("1","kavya"));
hs1.add(new emp1("2","yamini"));
System.out.println(hs1);

	}

}
