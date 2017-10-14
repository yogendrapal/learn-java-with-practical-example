class StringExample2
{
	public static void main(String args[])
	{
		/*String s = "LearnByWatch";
		System.out.println("Length of s is " + s.length());
		System.out.println(s.charAt(s.length()-1));
		System.out.println(s.charAt(0));*/
		byte[] b = "abc".getBytes();
		for(int i=0;i<b.length;i++)
		{
			System.out.println((char)b[i]);
		}
	}
}