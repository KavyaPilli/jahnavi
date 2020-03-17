package cts;
interface TestNumber1
{
	public boolean teststr(int x);
}
public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TestNumber1 tn=i->{
	              if(i>10)
                  return true;
	              else
	            	  return false;
};
System.out.println(tn.teststr(12));
	}

}
