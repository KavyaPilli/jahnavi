package cts;

public class InnerClassDemo {
public void Show()
{
	class One
	{
		public int Greater()
		{
		 int e[]= {11,22,33,44,55};
		 int max=e[0];
		 for(int i=1;i<e.length;i++)
		 {
			 if(max<e[i])
			 {
				 max=e[i];
			 }
			 
		 }
		 return(max);
		}
		
	}
	One ob=new One();
	System.out.println(ob.Greater());
}


}
