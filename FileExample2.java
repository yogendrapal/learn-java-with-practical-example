import java.io.File;
class FileExample2
{
	public static void main(String args[])
	{
		//File f1 = new File("temp/temp1");
		File f2 = new File("temp/tmp");
		/*if(f1.renameTo(f2))
		{
			System.out.println("Folder renamed...");
		}
		else
		{
			System.out.println("Folder cann't be renamed...");
		}
		if(f2.delete())
		{
			System.out.println("Folder removed...");
		}
		else
		{
			System.out.println("Folder cann't be removed...");
		}*/
		if(f2.exists())
		{
			System.out.println("Folder exists....");
		}
		else
		{
			System.out.println("Folder not exists...");
		}
	}
}