import java.util.*;
import java.io.*;
class Test{
  boolean CompairList(ArrayList<Integer> al1, ArrayList<Integer> al2){
    if(al1.equals(al2)){
      return true;
    }
    return false;
  }
  boolean CompairListIgnoringOrder(ArrayList<Integer> al1, ArrayList<Integer> al2){
    if(new HashSet<>(al1).equals(new HashSet<>(al2))){
      return true;
    }
    return false;
  }
}
class CollecListCompair{
  public static void main(String args[])throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter Number of element for ArrayList: ");
    int iSize = Integer.parseInt(br.readLine());
    ArrayList<Integer> al = new ArrayList<>();
    System.out.println("Enter Elment for ArrayList: ");
    for(int i = 0; i < iSize; i++){
      al.add(Integer.parseInt(br.readLine()));
    }
    System.out.print("Enter Number of element for ArrayList: ");
    int iSize2 = Integer.parseInt(br.readLine());
    ArrayList<Integer> al2 = new ArrayList<>();
    System.out.println("Enter Elment for ArrayList: ");
    for(int i = 0; i < iSize2; i++){
      al2.add(Integer.parseInt(br.readLine()));
    }
    Test obj = new Test();
    boolean result = obj.CompairListIgnoringOrder(al,al2);
    System.out.println(result);
  }
}