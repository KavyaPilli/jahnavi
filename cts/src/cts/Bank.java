package cts;
interface RBI
{

 public abstract void savings();//by default methods r public in interface
 public abstract void loans();
 public void deposits();
 default void newReq()
 {
	 System.out.println("This is a default Method in interface");
 }
 public static void Check() 
 {
	System.out.println("This is a Static Method in RBI interface");
 }
 
}
class HDFC implements RBI
{
 public void savings()
  {
    System.out.println("HDFC rules for savings");
  }
 public void loans()
  {
    System.out.println("HDFC provides loans for students and gold");
  }
 public void deposits()
  {
    System.out.println("HDFC accepts FD for savings");
  }
 /*public static void Check() 
 {
	System.out.println("This is a Static Method in hdfc");
 }
public void newReq()
 {
	 System.out.println("This is a default Method in HDFC");
 }*/
}
class SBI implements RBI
{
	public void savings()
  {
    System.out.println("SBI rules for savings");
  }
	public void loans()
  {
    System.out.println("SBI provides loans for agriculture, land and eductaion");
  }
	public void deposits()
  {
    System.out.println("SBI accepts FD for savings");
  }
}
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI.Check();
		HDFC hdfc=new HDFC();
		hdfc.savings();
		hdfc.loans();
		hdfc.deposits();
	    //hdfc.Check();
		hdfc.newReq();
		SBI sbi=new SBI();
		sbi.savings();
		sbi.loans();
		sbi.deposits();
		
	}

}