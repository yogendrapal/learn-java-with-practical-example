import java.io.*;
											
class PalindromeNo
{
	  public static void main(String arg[])
	  {
		    int n=0,m=0,r=0,prev=0;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try
			{
				System.out.println("Enter the value  ");
				n=Integer.parseInt(br.readLine());
			}catch(Exception ee){}
			prev=n;
		    while(n>0)
			{
				r=n%10;
				m=m*10+r;
				n=n/10;
			}
			if(prev==m) System.out.println("The Given number is  palindrome  number...");
			else System.out.println("Given number is not a palindrome number....");
	  }
}