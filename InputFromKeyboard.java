import java.io.*;
class InputFromKeyboard
{
	 public static void main(String args[])
	 {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int a=0,b=0,c=0;
		 try
		 {
			 //System.out.println("Enter string   ");
			 //System.out.println("Hello "+ br.readLine());
			 System.out.println("Enter two numbers...");
			 a=Integer.parseInt(br.readLine());
			 b=Integer.parseInt(br.readLine());
			 c=a+b;			
		 }catch(IOException ie){}
		 System.out.println("Addition of " + a + " and " + b + " is " + c);
	 }
}