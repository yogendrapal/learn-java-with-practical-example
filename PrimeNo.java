import java.io.*;
class PrimeNo
{
	 public static void main(String arg[])
	 {
		   int n=0,i,divCount=0;
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		   try
		   {
			   System.out.println("Enter number  ");
			   n=Integer.parseInt(br.readLine());
		   }catch(IOException ee){}
			for(i=1;i<=n;i++)
			{
				if(n%i==0) divCount++;
			}
			if(divCount>2 || n==1) System.out.println("Given number is no prime number  ");
			else System.out.println("Given number is a prime number ");
	 }
}
