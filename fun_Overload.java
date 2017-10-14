class fun_Overload
{
	int add(int a, int b)
	{
		return a+b;
	}
	int add(int a, int b, int c)
	{
		return a+b+c;
	}
	String add(String s1, String s2)
	{
		return s1+s2;
	}
	public static void main(String args[])
	{
		fun_Overload fov=new fun_Overload();
		System.out.println(fov.add("Learn By", " Watch"));
		System.out.println(fov.add(2,3));
		System.out.println(fov.add(2,3,4));
	}
}