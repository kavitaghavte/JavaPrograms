////program to write data into file and read data from file using FileOutputStream and FileInputStream


import java.io.*;                      
class Demo
{
	public Demo(String name)
	{
		try
		{
			BufferedReader dobj=new BufferedReader(new InputStreamReader(System.in));
			FileOutputStream fout=new FileOutputStream(name,true);
			FileInputStream fin=null;
			System.out.println("\nEnter escape key at the end of file : ");
			char str;
			while((str=(char)dobj.read())!=27)                                                //27 is the ascii value of escape key
			{
				fout.write(str);
			}

			File fobj=new File(name);
			if(fobj.exists())
			{
				System.out.println("\n-------------Information about the file are------------------\n");
				System.out.println("File Parent : "+fobj.getParent()+"\nlength of file is : "+fobj.length());
				System.out.println("File path : "+fobj.getPath()+"\nFile Absolute Path : "+fobj.getAbsolutePath());

	 			fin=new FileInputStream(name);
				System.out.println("\nData in the file : ");
				int ch;
				while((ch=fin.read())!=-1)                                       //read method of FileInputStream return the integer value
				{
					System.out.print((char)ch);
				}
			}
			fout.close();
			fin.close();
		}
		catch(IOException io)
		{
			System.out.println(io);
		}
	}
}
class File1
{
	public static void main(String arg[])throws IOException
	{
		System.out.println("\n***********program to read and write the data in file using FileInputStream and FileOutputStream********************\n");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the name of file to Which you want to write and read data : ");
		String name=br.readLine();
		Demo obj=new Demo(name);
	}
}
