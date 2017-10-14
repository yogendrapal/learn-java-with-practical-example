class thisKeyword
{
 int a=5;
 void change(int a)
 {
	 this.a=a+1;
 }
 public static void main(String args[])
 {
	  thisKeyword th = new thisKeyword();
	  System.out.println("th.a="+th.a);
	  th.change(10);
	  System.out.println("th.a="+th.a);
 }
}