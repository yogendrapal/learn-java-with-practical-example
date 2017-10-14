class base
  {
       void showInBase()
	     {
		      System.out.println("Vineet Agrawal");
		}
    }
class base1 extends base
  {
       void showInBase1()
		{
		    showInBase();
		}
   }
 class derived extends base1
    {
		void showInDerived()
		  {
		         showInBase1();
		  }
		 public static void main(String args[])
			{
			      derived d = new derived();
				  d.showInDerived();
			}
     }			