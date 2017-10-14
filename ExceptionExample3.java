class ExceptionExample3
{
	public static void main(String args[])
	{
		int a=5,b=0;
		int[] n = new int[2];
		System.out.println("Main Starts..");
		try
		{
			System.out.println(a/2);
			n[a]=10;
		}catch(ArithmeticException e)
		{
			b=1;
			System.out.println(a/b);
		}
		catch(IndexOutOfBoundsException e)
		{
			n[b]=10;
			System.out.println("n[b]="+n[b]);
		}
		System.out.println("Main Ends...");
	}
}