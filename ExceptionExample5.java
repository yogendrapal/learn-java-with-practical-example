class ExceptionExample5
{
	 public static void main(String args[])
	 {
		 int a=5,b=0;
		 System.out.println("Main Starts...");
		 try
		 {
			 b=2;
			 System.out.println(a/b);
		 }catch(ArithmeticException e)
		 {
			 b=1;
			 System.out.println(a/b);
		 }
		 finally
		 {
			 System.out.println("Main Ends...");
		 }
		 
	 }
}