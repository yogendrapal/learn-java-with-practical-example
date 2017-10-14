import java.io.*;

class ReverseNo
{
	  public static void main(String arg[])
	  {
		    int n=0,m=0,r=0;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try
			{
				System.out.println("Enter the value  ");
				n=Integer.parseInt(br.readLine());
			}catch(Exception ee){}
		    while(n>0)
			{
				r=n%10;
				m=m*10+r;
				n=n/10;
			}
			System.out.println("The reverse number is "+m);
	  }
}