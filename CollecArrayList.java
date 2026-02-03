import java.util.*;
import java.io.*;
class Test{
  void reDuplUsingHashSet(ArrayList<Integer> al){
    HashSet<Integer> hs = new HashSet<>(al);
    al.clear();
    al.addAll(hs);
  }
  void reDuplUsingLinkHashSet(ArrayList<Integer> al){
    LinkedHashSet<Integer> hs = new LinkedHashSet<>(al);
    al.clear();
    al.addAll(hs);
  }
  void removeDuplicate(ArrayList<Integer> al){
    for(int i = 0; i < al.size();i++){
      for(int j= i+1; j<al.size(); j++){
        if(al.get(i).equals(al.get(j))){
          al.remove(j);
          j--;
        }
      }
    }
  }
  void reDuplUsingIterator(ArrayList<Integer> al){
    for(int i = 0; i < al.size();i++){
      ListIterator<Integer> li = al.listIterator(i+1);
      while(li.hasNext()){
        Integer value = li.next();
        if(al.get(i).equals(value)){
          //al.remove(value);
          li.remove();
        }
      }
    }
  }
  HashMap<Integer,Integer> CountFrequency(ArrayList<Integer> al){
    HashMap<Integer,Integer> hm = new HashMap<>();
    for(Integer num: al){
      if(hm.containsKey(num)){
        hm.put(num,hm.get(num)+1);
      }else{
        hm.put(num,1);
      }
    }
    return hm;
  }
}
class CollecArrayList{
  public static void main(String args[])throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter Number of element for ArrayList: ");
    int iSize = Integer.parseInt(br.readLine());
    ArrayList<Integer> al = new ArrayList<>();
    System.out.println("Enter Elment for ArrayList: ");
    for(int i = 0; i < iSize; i++){
      al.add(Integer.parseInt(br.readLine()));
    }
    while(true){
      System.out.println("1.Remove dublicate\n");
      System.out.println("Enter the choice: ");
      int choice = Integer.parseInt(br.readLine()); 
      Test obj = new Test();
      if(choice > 4){
        break;
      }
      switch(choice){
        case 1:
          obj.removeDuplicate(al);
          System.out.println(al);
          break;
        case 2:
          HashMap<Integer,Integer> hm = obj.CountFrequency(al);
          System.out.println(hm);
          break;
        default:
          break;
      }
    }
  }
}