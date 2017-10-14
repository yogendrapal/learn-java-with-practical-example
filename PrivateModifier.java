class base
{
	protected int a=5;
}
class PrivateModifier extends base
{
	public void accessProperty()
	{
		a=10;
		System.out.println(a);
	}
	public static void main(String args[])
	{
		PrivateModifier pm = new PrivateModifier();
		pm.accessProperty();
	}
}