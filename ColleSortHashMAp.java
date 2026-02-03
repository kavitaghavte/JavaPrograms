import java.util.*;
import java.io.*;
class Test{
  TreeMap<Integer, String> sortHashMapByKey(HashMap<Integer, String> hm){
    TreeMap<Integer,String> tm = new TreeMap<>(hm);
    return tm;
  }
  LinkedHashMap<Integer, String> sortHashMapByValue(HashMap<Integer, String> hm){
    List<Map.Entry<Integer,String>> list = new ArrayList<>(hm.entrySet());
    Collections.sort(list,(e1,e2)->e1.getValue().compareTo(e2.getValue()));
    LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
    for(Map.Entry<Integer,String> entry: list){
      lhm.put(entry.getKey(),entry.getValue());
    }
    return lhm;
  }
}
class ColleSortHashMAp{
  public static void main(String args[])throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while(true){
      System.out.println("\n1.sortHashMapByKey\n2.sortHashMapByValue\n");
      System.out.println("Enter the choice: ");
      int choice = Integer.parseInt(br.readLine()); 
      if(choice > 4){
        break;
      }
      System.out.print("Enter Number of element for HashMap: ");
      int iSize = Integer.parseInt(br.readLine());
      HashMap<Integer, String> hm = new HashMap<>();
      for(int i = 0; i < iSize; i++){
        System.out.print("Enter Key: ");
        int key = Integer.parseInt(br.readLine());
        System.out.print("Enter value: ");
        String value = br.readLine();
        hm.put(key,value);
      }
      Test obj = new Test();
      switch(choice){
        case 1:
          TreeMap<Integer, String> tm = obj.sortHashMapByKey(hm);
          System.out.println(tm);
          break;
        case 2:
          LinkedHashMap<Integer, String> lhs = obj.sortHashMapByValue(hm);
          System.out.println(lhs);
          break;
        default:
          break;
      }
    }
  }
}