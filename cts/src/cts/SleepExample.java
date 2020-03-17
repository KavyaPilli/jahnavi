package cts;
class SleepExample extends Thread
{
	@Override
	public void run()
	{
		try
		{
		System.out.println("strting of thread executing");

		for(int i=100;i<=200;i++)
		{
			System.out.println(i);
           this.sleep(50);
		}
		System.out.println("End of thread executing");
		}
		catch(InterruptedException e)
		{
			System.out.println(e);

	    }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SleepExample se=new SleepExample();
se.start();
System.out.println(se.getState());

for(int j=1;j<=100;j++)
	System.out.println(j);
System.out.println(se.getState());
System.out.println("Thread priority is "+se.getPriority());
System.out.println("Thread name is "+se.getName());
System.out.println("Thread id is "+se.getId());
System.out.println("Thread group is "+se.getThreadGroup());




	}

}