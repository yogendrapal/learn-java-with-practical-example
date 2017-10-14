import java.io.*;
class FileExample4
{
	public static void main(String args[])
	{
		File f = new File("temp");
		File[] flist = f.listFiles();
		int TotalFiles=0,TotalFolders=0;
		for(int i=0;i<flist.length;i++)
		{
			if(flist[i].isFile())
			{
				System.out.println(flist[i].getName()+"     <File>");
				TotalFiles++;				
			}
			if(flist[i].isDirectory())
			{
				System.out.println(flist[i].getName()+"     <Dir>");
				TotalFolders++;
			}
		}
		System.out.println("Total Files are "+ TotalFiles);
		System.out.println("Total Folders are "+ TotalFolders);
	}
}