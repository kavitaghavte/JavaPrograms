//program to read the data in the file using FileReader

import java.io.*;
class Demo
{
	public Demo(String name)
	{
		try
		{
			File f=new File(name);
			if(f.exists())
			{
				FileReader fr=null;
				try
				{
					fr=new FileReader(name);
					
					int a;
					while((a=fr.read())!=-1)
					{
						System.out.print((char)a);
					}
				}
				finally
				{
					fr.close();
				}
			}
			else
			{
				throw new FileNotFoundException("the file from which you want to read the data is not exists : \n");
			}
		}
		catch(IOException io)
		{
			System.out.println(io);
		}
	}
}
class File6
{
	public static void main(String arg[])throws IOException
	{
		System.out.println("\n****************************Program to read data from file**********************************\n");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the name of file to read the data : ");
		String name=br.readLine();
		Demo dobj=new Demo(name);
	}
}
