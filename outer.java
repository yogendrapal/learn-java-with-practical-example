class outer
   {
        void display()
		  {
		      System.out.println("outer");
		   }
		 class inner
			{
				void display()
					{
						System.out.println("Inner class");
				     }
			}
		public static void main(String args[])
			{
				 outer o = new outer();
				 o.display();
				 outer.inner in = new outer().new inner();
				 in.display();
			}
	}		