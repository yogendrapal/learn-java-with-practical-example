class base
{
	 public base(String s)
	 {
		 System.out.println("Hello "+s);
	 }
	 public base()
	 {
		 System.out.println("LearnByWatch");
	 }
}
class base1 extends base 
{
	public base1(String s)
	{
		super(s);
	}
	public base1() {}
}
class SuperExample3 extends base1
{
	public SuperExample3()
	{
		System.out.println("Solution Center");
	}
	public SuperExample3(String s)
	{
		super("Rahul");
		System.out.println("Hello "+s);
	}
	public static void main(String args[])
	{
		new SuperExample3("Vineet Agrawal");
	}
}