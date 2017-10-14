import java.io.*;

class RecurSeries

{
	   void Series(int i, int n)
	   {
		     System.out.print(i + ", ");
		     if(i<n)
			 {
				 Series(i+1,n);
			 }
	   }	 
	   public static void main(String args[])
	   
	   {
		     int n=1;
			 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 try
			 {
				 System.out.println("Enter value ");
				 n=Integer.parseInt(br.readLine());
			 }catch(IOException ee){}
			 RecurSeries rs = new RecurSeries();
			 rs.Series(1,n);
	   }
}	   