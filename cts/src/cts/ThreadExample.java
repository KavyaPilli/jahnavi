package cts;
class MyThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println("strting of thread executing");

		for(int i=100;i<=200;i++)
		{
			System.out.println(i);

		}
		System.out.println("End of thread executing");

	}
}

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyThread t=new MyThread();
System.out.println("MAin method strted execution");

t.start();

for(int j=1;j<=100;j++)
	System.out.println(j);

	System.out.println("MAin method completed execution");
	System.out.println("Thread priority is "+t.getPriority());


	}

}
