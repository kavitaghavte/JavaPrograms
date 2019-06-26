//this program reverse the containt in the file

import java.io.*;
public class File9
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the name of file : ");
		String name=bfr.readLine();
		FileInputStream fi=new FileInputStream(name);
		BufferedInputStream br=new BufferedInputStream(fi);
		int n=fi.available();
		
		for(int i=n-1;i>=0;i--)
		{
			br.mark(i);
			br.skip(i);
			System.out.print((char)br.read());
			br.reset();
		}
		fi.close();
	}
}

