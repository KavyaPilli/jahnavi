package cts;
import java.util.TreeSet;
class Employ 
{
	String Name;
	String Id;
	String Dept;
	public Employ(String Name,String Id,String Dept)
	{
		super();
		this.Name=Name;
		this.Id=Id;
		this.Dept=Dept;
	}
}
public class TestTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     TreeSet tr=new TreeSet();
     tr.add("Grapes");
     tr.add("Pine Apple");
     tr.add("Kiwi");
     tr.add("Apple");
     System.out.println(tr);
	}

}
