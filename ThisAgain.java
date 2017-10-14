class ThisAgain
{
	 ThisAgain()
	 {
		 this("Vineet Agrawal");
		 System.out.println("LearnbyWatch");
	 }
	 ThisAgain(String s)
	 {
		 //this();
		System.out.println("Hello "+s);		 
	 }
	 public static void main(String args[])
	 {
		  //new ThisAgain("Vineet Agrawal");
		  new ThisAgain();
	 }
}