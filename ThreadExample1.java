class ThreadExample1
{
	public static void main(String args[])
	{
		System.out.println("Main Thread Starts...");
		for(int i=1;i<=3;i++)
		{
			System.out.println("Main Thread...");
		try
		{
			Thread.sleep(1000);
		}catch(InterruptedException e){}
		}
		System.out.println("Main Thread Ends...");
	}
}