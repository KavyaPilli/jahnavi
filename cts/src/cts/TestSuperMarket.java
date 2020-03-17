package cts;
abstract class SuperMarket
{ 

  public void selectProducts()
  {
	  System.out.println("In select Products");
  }
  abstract public void payment();
  
  public void shipmentOfGoods()
  { 
	  System.out.println("In shipment of goods");

  }
}
 class Market1 extends SuperMarket
 {
	 public void payment()
	 {
	 System.out.println("Only cash payment is accepted");
	 }
	 public void Insurance()
	 {
		 System.out.println("Insurance will be provided for shipment");
	 }
 }
 class Market2 extends SuperMarket
 {
	 public void payment()
	 {
		 System.out.println("Only Debit card is accepted");
	 }
 }
public class TestSuperMarket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Market1 m1=new Market1();
		m1.selectProducts();
		m1.payment();
		m1.Insurance();
		m1.shipmentOfGoods();
		Market2 m2=new Market2();
		m2.selectProducts();
		m2.payment();
		m2.shipmentOfGoods();
		
	}

}
