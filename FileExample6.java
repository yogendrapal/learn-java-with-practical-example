import java.io.*;
class FileExample6
{
	 public static void main(String args[])
	 {
		 File f = new File("temp/FileExample1.java");
		 if(f.isHidden())
		 {
			 System.out.println("hidden file...");
		 }
		 System.out.println("Last Modified: "+ f.lastModified());
		 if(f.canRead())
		 {
			 System.out.println("Can read file...");
		 }
		 if(f.canWrite())
		 {
			 System.out.println("Writable file...");
		 }
	 }
}