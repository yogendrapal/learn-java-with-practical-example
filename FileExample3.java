import java.io.*;
class FileExample3
{
	public static void main(String args[])
	{
		File f = new File("LBW.txt");
		/*try
		{
		if(f.createNewFile())
		{
			System.out.println("File Created....");
		}
		else
		{
			System.out.println("File cann't be created....");
		}
		}catch(IOException ie){}*/
		if(f.delete())
		{
			System.out.println("File removed....");
		}
		else
		{
			System.out.println("File not removed...");
		}
	}
}