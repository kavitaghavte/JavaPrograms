//program to copy data from one file into another using BufferedInputStream and BufferedOutputStream

import java.io.*;
class Demo
{
	public Demo(String name1,String name2)
	{
		try
		{
			File f=new File(name1);
			if(f.exists())
			{
				BufferedInputStream bfin=null;
				BufferedOutputStream bfout=null;
				try
				{
					bfin=new BufferedInputStream(new FileInputStream(name1));
					bfout=new BufferedOutputStream(new FileOutputStream(name2,true),1024);
					int a;
					while((a=bfin.read())!=-1)
					{
						bfout.write((char)a);
					}
				}
				finally
				{
					bfin.close();
					bfout.close();
				}
			}
			else
			{
					throw new FileNotFoundException("The File From which you want to copy the data is not exists \n");
			}
		}
		catch(IOException io)
		{
			System.out.println(io);
		}
	}
}
class File3
{
	public static void main(String arg[])throws IOException
	{
		System.out.println("\n******************Program to copy the data from one file to another file using BuffredInputStream and BufferedOutputStram***********************\n");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the name of file from which you want to copy the data : ");
		String name1=br.readLine();
		System.out.print("Enter the name of the file to which you want to copy the data : ");
		String name2=br.readLine();
		Demo obj=new Demo(name1,name2);
	}
}
