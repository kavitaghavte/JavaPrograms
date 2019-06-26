//program to read data from file and write data into file using BufferedOutputReader and BufferedInputReader

import java.io.*;
class Demo
{
	public Demo(String name)
	{

		try(BufferedOutputStream bout=new BufferedOutputStream(new FileOutputStream(name,true));
		BufferedInputStream bin=new BufferedInputStream(new FileInputStream(name)))
		{
			try
			{
				DataInputStream dobj=new DataInputStream(System.in);

				System.out.println("Enter escape key at the end of the file : ");
				char ch;
				while((ch=(char)dobj.read())!=27)
				{
					bout.write(ch);
				}
			}
			finally
			{
				bout.close();                 //if we not close the file here in which we write the data then the data at time of running the program will not display 
			}
			try
			{
				System.out.println("\nData in the file : ");
				int a;
				while((a=bin.read())!=-1)
				{
					System.out.print((char)a);
				}
				System.out.println();
			}
			finally
                        {
			       	bin.close();
                        }
		}
		catch(IOException io)
		{
			System.out.println(io);
		}
	}
}
class File2
{
	public static void main(String arg[])
	{
		System.out.println("\n****************************program to write and read data in file using BufferedOutputStream and BufferedInputStream*****************************\n");
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter the name of file to write the data into file : ");
			String name=br.readLine();
			Demo dobj=new Demo (name);
		}
		catch(IOException io)
		{
			io.printStackTrace();
		}
	}
}
