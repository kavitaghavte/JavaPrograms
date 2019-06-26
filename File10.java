//concept of seriallization

import java.io.*;
class Employee implements Serializable
{
	int id;
	String name;
	float sal;
	
	public Employee(int id,String name,float sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
}
class File10
{
	public static void main(String arg[])throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Number of employee : ");
		int n=Integer.parseInt(br.readLine());

		ObjectOutputStream oout=new ObjectOutputStream(new FileOutputStream("myfile.ser",true));

		for(int i=0;i<n;i++)
		{
			System.out.print("\nenter the employee id : ");
                        int id=Integer.parseInt(br.readLine());
                        System.out.print("Enter the employee name : ");
                        String name=br.readLine();
                        System.out.print("Enter the employee salary : ");
                        float sal=Float.parseFloat(br.readLine());

			Employee e=new Employee(id,name,sal);
			oout.writeObject(e);
		}
		oout.close();
             
		ObjectInputStream oin=new ObjectInputStream(new FileInputStream("myfile.ser"));  //in deserialization when we use ObjectInputStream to read the object it throw EOFException
		try
		{
			Employee eobj;
			System.out.println("Data After deserialization :\n");
			while((eobj=(Employee)oin.readObject())!=null)
			{
				System.out.println("\nEmployee Id : "+eobj.id);
                                System.out.println("Employee Name : "+eobj.name);
                                System.out.println("Salary : "+eobj.sal);

			}
		}
		catch(EOFException ee)
		{
			System.out.println(ee);
		}
		finally
		{
			oin.close();
		}
	}
}
