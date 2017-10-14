import java.io.*;
class ReadFromFile
{
	 public static void main(String a[])throws Exception
	 {
		 File f = new File("TempFile.txt");
		 int len = (int) f.length();
		 FileInputStream fis = new FileInputStream(f);
		 byte[] b = new byte[len];
		 fis.read(b,0,len);
		 for(int i=0;i<b.length;i++)
		 {
			 System.out.print((char)b[i]);
		 }
	 }
}