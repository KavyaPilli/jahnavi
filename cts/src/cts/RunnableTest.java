package cts;
/*class MyRunThread implements Runnable
{//this is the code by using runnable interface
	public void run()
	{
		for(int i=0;i<50;i++)
		System.out.println(i);
	}
}*/
public class RunnableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	MyRunThread r=new MyRunThread();
  //Thread t1=new Thread(r);
		//t1.start();
		Runnable r=()->{
		for(int i=0;i<50;i++)
			System.out.println(i);
	};
	Thread t=new Thread(r);
	t.start();
	}

}
