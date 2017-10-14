import java.io.*;
class FileExample5
{
	public static void main(String args[])
	{
		File f = new File("temp/FileExample1.java");
		System.out.println(f.getPath());
		System.out.println(f.getParent());
	}
}