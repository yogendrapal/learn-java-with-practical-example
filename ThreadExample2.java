class ThreadExample2 implements Runnable
{
	Thread th;
	ThreadExample2()
	{
		th = new Thread(this,"Child Thread");
		th.start();
	}
	public void run()
	{
		System.out.println(th.getName() + " Starts...");
		try
		{
			for(int i=1;i<=3;i++)
			{
				System.out.println(th.getName());
				Thread.sleep(1000);
			}
		}catch(InterruptedException ie){}
	}
	public static void main(String args[])
	{
		ThreadExample2 MainThread = new ThreadExample2();
		System.out.println("Main Thread Starts...");
		try
		{
		for(int i=1;i<=3;i++)
		{
			System.out.println("Main Thread");
			Thread.sleep(1000);
		}
		}catch(InterruptedException e){}
		System.out.println("Main Thread Ends...");
	}
}