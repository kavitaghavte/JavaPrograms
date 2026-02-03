import java.util.*;
import java.io.*;
class Test{
  List<List<String>> FindGroupOfAnagram(ArrayList<String> al){
    Map<String,List<String>> map = new HashMap<>();
    for(String str: al){
      char arr[] = str.toCharArray();
      Arrays.sort(arr);
      String key = new String(arr);
      if(!map.containsKey(key)){
        map.put(key, new ArrayList<>());
      }
      map.get(key).add(str);
    }
    return new ArrayList<>(map.values());
  }
}
class ColleAnagramListGrop{
  public static void main(String args[])throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter size of List: ");
    int iSize = Integer.parseInt(br.readLine());
    ArrayList<String> al = new ArrayList<>();
    System.out.println("Enter the String: ");
    for(int i = 0; i < iSize; i++){
      al.add(br.readLine());
    }
    
    Test obj = new Test();
    List<List<String>> result = obj.FindGroupOfAnagram(al);
    System.out.println(result);
  }
}