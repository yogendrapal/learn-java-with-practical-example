class param_constructor
{
	int a=10;
	public param_constructor()
	{
		a=12;
	}
	public param_constructor(int b)
	{
		a=b;
	}
	public static void main(String args[])
	{
		param_constructor pc = new param_constructor(20);
		System.out.println(pc.a);
		param_constructor pc1 = new param_constructor();
		System.out.println(pc1.a);
	}
}