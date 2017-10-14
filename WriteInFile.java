import java.io.*;
class WriteInFile
{
	public static void main(String args[]) throws Exception
	{
		FileOutputStream fos = new FileOutputStream(new File("TempFile.txt"),true);
		byte[] b = "Vineet Agrawal".getBytes();
		fos.write(b,0,b.length);
		System.out.println("Data Saved...");
	}
}
