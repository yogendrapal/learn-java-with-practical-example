class employee
  {
	  int empID=5;
	  void showEmpID()
	  {
		  System.out.println(empID);
	  }	  
   }
   class company
   {
	   public static void main(String args[])
	  {
		  employee e; // object declaration
		  e=new employee();
		  e.showEmpID();
	  }
   }