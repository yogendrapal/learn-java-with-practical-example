class base
{
	public void show()
	{
		System.out.println("Show in base...");
	}
}
class base1 extends base
{
	 /*public void show()
	 {
		 super.show();
	 }*/
}
class SuperExample2 extends base1
{
	public void show()
	{
		super.show();
	}
	public static void main(String args[])
	{
		SuperExample2 se = new SuperExample2();
		se.show();
	}
}