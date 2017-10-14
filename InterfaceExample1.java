interface Calculation
{
	  public int add(int a, int b);
	  public int sub(int a, int b);
}
class InterfaceExample1 implements Calculation
{
	public int sub(int a, int b)
	{
		return a-b;
	}
	public int add(int a, int b)
	{
		return a+b;
	}
	public static void main(String args[])
	{
		InterfaceExample1 ie = new InterfaceExample1();
		System.out.println(ie.add(4,3));
		System.out.println(ie.sub(6,5));
	}
}