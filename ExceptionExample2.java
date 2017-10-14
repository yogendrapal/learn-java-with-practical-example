class ExceptionExample2
{
	public static void main(String args[])
	{
		int a=5,b=2;
		System.out.println("Main Starts...");
		try
		{
			System.out.println(a/b);
		}catch(Exception e)
		{
			b=1;
			System.out.println(a/b);
		}
		System.out.println("Main Ends...");
	}
}