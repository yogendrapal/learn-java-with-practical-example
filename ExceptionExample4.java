class ExceptionExample4
{
	public static void main(String args[])
	{
		int a=5,b=0;
		int[] n = new int[2];
		System.out.println("Main Starts...");
		try
		{
			System.out.println(a/b);
		}catch(ArithmeticException e)
		{
			b=1;
			System.out.println(a/b);
		}
		try
		{
			n[a]=10;
			System.out.println("n[a]="+n[a]);
		}catch(IndexOutOfBoundsException e)
		{
			a=b;
			n[a]=10;
			System.out.println("n[a]="+n[a]);
		}
		System.out.println("Main Ends...");
	}
}