import java. io.*;
class Employee implements Serializable{
  int id;
  String name;
  float sal;
  Employee(int id, String name, float sal){
    this.id = id;
    this.name = name;
    this.sal = sal;
  }
}
class SeriallizeObject{
  public void seriallizeEmployee(BufferedReader br){
    try{
      FileOutputStream fos = new FileOutputStream("emp.txt");
      ObjectOutputStream oos = new ObjectOutputStream(fos);

      System.out.print("How Many Employee: ");
      int no = Integer.parseInt(br.readLine());
      for(int i = 0; i < no; i++){
        System.out.print("Employee id: ");
        int id = Integer.parseInt(br.readLine());
        System.out.print("Employee Name: ");
        String name = br.readLine();
        System.out.print("Employee Sal: ");
        float sal = Float.parseFloat(br.readLine());
        Employee e = new Employee(id,name,sal);
        oos.writeObject(e);
      }
      oos.close();
      fos.close();
    }
    catch(IOException e){
      e.printStackTrace();
    }
  }
}
class DeSeriallizeObject{
  public void deSeriallizeEmployee()throws IOException{
    try{
      FileInputStream fis = new FileInputStream("emp.txt");
      ObjectInputStream ois = new ObjectInputStream(fis);
      while(true){
        Employee e = (Employee)ois.readObject();
        System.out.println("Employee id: "+e.id);
        System.out.println("Employee Name: "+e.name);
        System.out.println("Employee Sal: "+e.sal);
      }
    }
    catch(EOFException  e) {
      System.out.println("End of file reached");
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}
class Seriallization{
  public static void main(String args[])throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while(true){
      System.out.println("\n1.Seriallization\n2.Deseriallization\n");
      System.out.print("Enter the choice: ");
      int choice = Integer.parseInt(br.readLine()); 
      if(choice > 2){
        break;
      }
      switch(choice){
        case 1:
          SeriallizeObject seObj = new SeriallizeObject();
          seObj.seriallizeEmployee(br);
          break;
        case 2:
          DeSeriallizeObject deObj = new DeSeriallizeObject();
          deObj.deSeriallizeEmployee();
          break;
        default:
          break;
      }
    }
  }
}