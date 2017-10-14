import java.io.*;
class Armstrong
  {
       public static void main(String args[])
	     {
			  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		      int n=153,r,m=0,p;
			  try
			  {
				  System.out.println("Enter the value...");
				  n= Integer.parseInt(br.readLine());
			  }catch(IOException ee){}	  
			  p=n;
			  while(n>0)
			    {
				    r=n%10;
					m+=r*r*r;
					n=n/10;
				}
				if(m==p)
					{
						 System.out.println("Given number is armstrong..");
					}
				else
				 {
					    System.out.println("Given number is not armstrong....");
				 }
		}
  }
			  