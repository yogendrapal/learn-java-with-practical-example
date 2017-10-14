import java.io.*;

class FileExample7
{
	public static void main(String args[])
	{
	File f =new File("temp/msg.txt");
	System.out.println("Length of file msg.txt is " + f.length());
	f.setReadOnly();
	}
}
	