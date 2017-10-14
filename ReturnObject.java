class ReturnObject
{
	  int a=5;
	  ReturnObject changeObjectValue()
	  {
		 ReturnObject ro =new ReturnObject();
		 ro.a=10;
		 return ro;		  
	  }
	  public static void main(String args[])
	  {
		  ReturnObject ob = new ReturnObject();
		  System.out.println("ob.a="+ob.a);
		  ob=ob.changeObjectValue();
		  System.out.println("ob.a="+ob.a);
	  }
}
		  
	  