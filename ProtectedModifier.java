class base
{
	protected int a=5;
}
class ProtectedModifier extends base
{
	public void accessProperty()
	{
		a=10;
		System.out.println(a);
	}
	public static void main(String args[])
	{
		ProtectedModifier pm = new ProtectedModifier();
		pm.accessProperty();
	}
}