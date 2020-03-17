package cts;

class A {
int z;
A(int y,int z)
{
	System.out.println("inside parent constructor"+y+" "+z);
}
}
class Ex extends A
{
 Ex()
 {
	 super(10,20);
 }
 Ex(int k)
 {
	 super(10,20);
	 System.out.println(k);
 }
	public static void main(String[] args) {
		// TiODO Auto-generated method stub
     Ex e=new Ex(65);
     
    
	}
}
