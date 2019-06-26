//program to count the number of character,number of word,number of lines in the program

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
				FileReader fin=null;
				BufferedReader bin=null;

				try
				{
					fin=new FileReader(name);
					bin=new BufferedReader(fin);

				        int a;
					int wcnt=1;
					int lcnt=0;
					int acnt=0;
					System.out.println("\nData int the file are : ");
					while((a=bin.read())!=-1)                            //read line fuction return the hole string upto the new line
					{
						System.out.print((char)a);
						if(a!=' ')
							acnt++;
						if(a==' ')
							wcnt++;
						if(a=='\n')
							lcnt++;
					}
					System.out.println("\n\nNumber of character in the file : "+acnt);
					System.out.println("\nNumber of world in the file : "+wcnt);
					System.out.println("\nNumber of lines in the file : "+lcnt);
				}
				finally
				{
					bin.close();
				}
			}
			else
			{
				throw new FileNotFoundException("The fiel that you want to read data is not found ");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class File8
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the name of file to read its content : ");
		String name=br.readLine();
		Demo fobj=new Demo(name);
	}
}

