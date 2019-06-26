//program to copy the data from one file to another file using FileReader and FileWriter
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
				BufferedWriter bw=null;
				BufferedReader br=null;
			
				try
				{
					br=new BufferedReader(new FileReader(name1));
					bw=new BufferedWriter(new FileWriter(name2),1024);
				
					int a;
					while((a=br.read())!=-1)
					{
						bw.write((char)a);
					}
				}
				finally
				{
					br.close();
					bw.close();
				}
			}
			else
			{
				throw new FileNotFoundException("The file from which you want to read the data is not found \n");
			}
		}
		catch(IOException io)
		{
			System.out.println(io);
		}
	}
}
class File4
{
	public static void main(String arg[])
	{
		System.out.println("\n************************Program to copy the data from one file to another using FileReader and FileWriter*****************************\n");
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter the name of file from which you want to copy the data : ");
			String name1=br.readLine();
			System.out.print("Enter the name of file to which you want to write the data : ");
			String name2=br.readLine();
			Demo dobj=new Demo(name1,name2);
		}
		catch(IOException io)
		{
			System.out.println(io);
		}
	}
}
