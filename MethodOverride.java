class base
{
	 public int add(int a, int b)
	 {
		 return a+b;
	 }
}
class MethodOverride extends base
{
	 public int add(int a, int b)
	 {
		 return a+b+10;
	 }
	 public static void main(String args[])
	 {
		 base b = new base();
		 System.out.println(b.add(4,5));
		 MethodOverride mo = new MethodOverride();
		 System.out.println(mo.add(4,5));
	 }
}