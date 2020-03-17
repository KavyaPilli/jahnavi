package cts;
/*This code is used to create thread using runnable interface
 class MyThread implements Runnable
{
	public void run()
	{
		System.out.println("Inside the thread..");
	}
}*/
public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*	MyThread m1=new MyThread();
	Thread t=new Thread(m1);
	t.start();
*/
		//code is used to implement thread using lambda exp
		Runnable runnable=()->System.out.println("Inside the Thread..");
		Thread t=new Thread(runnable);
		t.start();
	}

}
