class base 
{
	public void show()
	{
		System.out.println("Show in base...");
	}
}
class SuperExample1 extends base
{
	public void display()
	{
		super.show();
	}
	public void show()
	{
		 super.show();
		 System.out.println("Show in SuperExample1...");
	}
	public static void main(String agrs[])
	{
		SuperExample1 se = new SuperExample1();
		se.show();
	}
}