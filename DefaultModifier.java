class base
{
	int a=5;
}
class DefaultModifier extends base
{
	public void accessProperty()
	{
		a=10;
		System.out.println(a);
	}
	public static void main(String args[])
	{
		DefaultModifier pm = new DefaultModifier();
		pm.accessProperty();
	}
}