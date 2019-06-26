import java.io.*;

class File7
{
	public static void main(String arg[])
	{
		try
		{
			if(arg.length!=0)
			{
				String name=arg[0];

				File f=new File(name);         //if file not contain in current directory then give its path

				if(f.isDirectory())
				{
					System.out.println("\nIt is Directory \nContaint in the directory are :\n"); 
					String arr[]=f.list();
					for(int i=0;i<arr.length;i++)
					{
						System.out.println(arr[i]);
					}
					System.out.print("If you want to delete .txt file in this directory then Enter yes othrwise enter no : ");
					BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
					String str=br.readLine();

					if(str.equals("yes"))
					{
						for(int i=0;i<arr.length;i++)
						{
							if(arr[i].contains(".txt"))
							{
	 							File f1=new File(name+"/"+arr[i]);
								f1.delete();
							}
							else
								System.out.println(arr[i]);
						}
					}
				}
				if(f.isFile())
				{
					System.out.println("\nName : "+f.getName()+"\nPath : "+f.getPath()+"\nAbsolute Path : "+f.getAbsolutePath()+"\nParent : "+f.getParent()+"\nlength : "+f.length());
				}
					
			}
			else
			{
				throw new NullPointerException("Pease provoid command line argument\n");
			}
		}
		catch(Exception e)              //IOException is not super class of NullPointerException
		{
			System.out.println(e);
		}
	}
}
