class statickeyword
{
	int a=5; // instance member
	static int b=5; // static member
	public static void main(String args[])
	{
		statickeyword s1 = new statickeyword();
		statickeyword s2 = new statickeyword();
		System.out.println("s1.a++="+s1.a++);
		System.out.println("s2.a++="+s2.a++);
		System.out.println("s1.b++="+s1.b++);
		System.out.println("s2.b++="+s2.b++);
		System.out.println("statickeyword.b="+statickeyword.b);
		
	}
}