import java.util.*;
import java.io.*;
class Test{
  char findNonRepeatedCharacter(String str){
    LinkedHashMap<Character,Integer> hm = new LinkedHashMap<>();
    for(Character ch: str.toCharArray()){
      if(hm.containsKey(ch)){
        hm.put(ch,hm.get(ch)+1);
      }else{
        hm.put(ch,1);
      }
    }
    for(Map.Entry<Character,Integer> entry: hm.entrySet()){
      if(entry.getValue() == 1){
        return entry.getKey();
      }
    };
    return '\0';
  }
}
class CollectionString{
  public static void main(String args[])throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str;
    int isize;
    while(true){
      System.out.println("1.Non reapeated character\n");
      System.out.println("Enter the choice: ");
      int choice = Integer.parseInt(br.readLine()); 
      if(choice > 4){
        break;
      }
      System.out.print("Enter string: ");
      str = br.readLine();
      Test obj = new Test();
      switch(choice){
        case 1:
          char ch = obj.findNonRepeatedCharacter(str);
          if(ch != '\0' ){
            System.out.println(ch);
          }
          else{
            System.out.println("No non-reapeaded chacter");
          }
          break;
        case 2:
          break;
        default:
          break;
      }
    }
  }
}