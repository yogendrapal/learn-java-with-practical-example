import java.io.File;
class FileExample1
{
	public static void main(String args[])
	{
		File f = new File("temp/temp1");
		if(f.mkdir())
		{
			System.out.println("Folder Created...");
		}
		else
		{
			System.out.println("Cann't create folder...");
		}
	}
}