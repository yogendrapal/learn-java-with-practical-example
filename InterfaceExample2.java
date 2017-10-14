interface IFace1
{
	  public int add(int a, int b);
	  public int sub(int a, int b);
}
interface IFace2
{
	  public int add(int a, int b);
	  public int multiply(int a, int b);
}

class InterfaceExample2 implements IFace1, IFace2
{
	public int add(int a, int b)
	{
		return a+b;
	}
	public int sub(int a, int b)
	{
		return a-b;
	}public int multiply(int a, int b)
	{
		return a*b;
	}
	public static void main(String args[])
	{
		InterfaceExample2 ie = new InterfaceExample2();
		System.out.println(ie.add(3,4));
		System.out.println(ie.sub(3,4));
		System.out.println(ie.multiply(3,4));
	}
}

