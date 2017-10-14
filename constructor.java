class constructor
{
	int a,b;
	public constructor()
	{
		a=10;
		b=20;
	}
	public static void main(String args[])
	{
		 constructor c = new constructor();
		 System.out.println("c.a=" + c.a + ", c.b=" + c.b);
	}
}