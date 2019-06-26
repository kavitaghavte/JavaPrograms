//This program demonstrate the concept of storing String into file using BufferedWriter and reading string from file using BufferedReader


import java.io.*;
class Demo
{
	public Demo(String name)
	{
		try(BufferedWriter bw=new BufferedWriter(new FileWriter(name,true),1024);
		BufferedReader brf=new BufferedReader(new FileReader(name)))
		{
			try
			{
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				String str1;
				System.out.println("Enter exit at the end of file\n");
				while(!(str1=br.readLine()).equals("exit"))
				{
					bw.write(str1+"\n");
				}
			}
			finally
			{
				bw.close();                        //if we dont close file here then the data we write in the file at the running time will not display at running time
			}
			try
			{
				System.out.println("Data from file are : ");
				String str2;
				while((str2=brf.readLine())!=null)
				{
					System.out.println(str2);
				}
			}
			finally
			{
				brf.close();
			}
		}
	        catch(IOException io)
		{
		       System.out.println(io);
		}	       
	}
}
class File5
{
	public static void main(String arg[])throws IOException
	{
		System.out.println("\n*******************program to stores string into file using BufferedWriter and reading string from file using BufferedReader**********************\n");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the name of file in which you want to write the data : ");
		String name=br.readLine();
		Demo dobj=new Demo(name);
	}
}
