package cts;

public class classTestObjects {
	static int c=0;
	{
		c++;
		
	}
	public classTestObjects()
	{
		
	}
	public classTestObjects(int n)
	{
		
	}
	public classTestObjects(String str)
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		classTestObjects oc1=new classTestObjects();
	classTestObjects oc2=new classTestObjects(5);
	classTestObjects oc3=new classTestObjects("kavya");
		
       System.out.println("no.of Objects"+c);
	}

}
