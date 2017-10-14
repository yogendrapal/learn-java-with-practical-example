abstract class base
{
	public int add(int a, int b)
	{
		return a+b;
	}
	abstract int sub(int a, int b);
}
class AbstractClassExample2 extends base
{
	int sub(int a, int b)
	{
		return a-b;
	}
	public static void main(String args[])
	{
		AbstractClassExample2 ace = new AbstractClassExample2();
		System.out.println(ace.add(3,4));
		System.out.println(ace.sub(5,4));
	}
}