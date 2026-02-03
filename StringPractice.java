import java.io.*;
import java.util.*;
class StringUtil{
  String reverse(String s){
    int i = 0, j = 0;
    char arr[] = s.toCharArray();
    char temp;
    for(i = 0, j = arr.length-1; i<j; i++,j--){
      temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
    return (new String(arr));
  }
  String toggleCase(String s){
    char arr[] = s.toCharArray();
    char temp;
    for(int i = 0; i<arr.length; i++){
      if(Character.isUpperCase(arr[i])){
        arr[i] = Character.toLowerCase(arr[i]);
      }else if(Character.isLowerCase(arr[i])){
        arr[i] = Character.toUpperCase(arr[i]);
      }
    }
    return (new String(arr));
  }
  boolean checkPalindrom(String s){
    int i = 0, j = 0;
    char arr[] = s.toCharArray();
    for(i = 0, j = arr.length-1; i<j; i++,j--){
       if(arr[i] != arr[j]){
        return false;
      }
    }
    return true; 
  }
  int wordCount(String s) {
    int count = 0;
    int i = 0;
    char[] arr = s.trim().toCharArray();
    while (i < arr.length) {
      if (arr[i] != ' ') {
          count++;
          while (i < arr.length && arr[i] != ' ') {
              i++;
          }
      } else {
          i++;
      }
    }
    return count;
  }
  int maxWordlength(String s){
    int maxLength = 0, iCnt = 0, i = 0;
    char arr[] = s.trim().toCharArray();
    while(i < arr.length){
      if(arr[i] != ' '){
        iCnt = 0;
        while( i < arr.length && arr[i] != ' '){
          iCnt++;
          i++;
        }
        if(iCnt > maxLength){
          maxLength = iCnt;
        }
      }else{
        i++;
      }
    }
    return maxLength;
  }
  String removeWhiteSpace(String s){
    int i = 0, j = 0;
    char arr[] = s.trim().toCharArray();
    char brr[] = new char[arr.length];
    while(i < arr.length){
      if(arr[i] == ' '){
        if(i < arr.length &&  j != 0){
          brr[j++] = arr[i];
        }
        while( i < arr.length && arr[i] == ' '){
          i++;
        }
      }else if(arr[i] != ' '){
        while( i < arr.length && arr[i] != ' '){
          brr[j++] = arr[i];
          i++;
        }
      }
    }
    return (new String(brr,0,j-1));
  }
  String reverseWord(String s){
    int i = 0, j = 0, start = 0, end = 0;
    char arr[] = s.trim().toCharArray();
    char brr[] = new char[arr.length];
    while(i < arr.length){
      if(arr[i] != ' '){
        start = i;
        while( i < arr.length && arr[i] != ' '){
          i++;
        }
        end = i-1;
        while(end >= start){
          brr[j++] = arr[end--];
        }
        if(i < arr.length && arr[i] == ' '){
          brr[j++] = ' ';
        }
      }else{
        i++;
      }
    }
    if(j > 0 && brr[j - 1] == ' ') {
      j--;
    }
    return (new String(brr,0,j));
  }
  boolean CheckAnagram(String str1,String str2){
    if(str1.length() != str2.length()){
      return false;
    }
    int freq[] = new int[256];
    for(int i = 0; i < str1.length(); i++){
      freq[str1.charAt(i)]++;
    }
    for(int i = 0; i < str2.length(); i++){
      freq[str2.charAt(i)]--;
    }
    for(int i = 0; i < 256; i++){
      if(freq[i] != 0){
        return false;
      }
    }
    return true;
  }
  boolean CheckAnagramUsingHashMap(String str1,String str2){
    if(str1.length() != str2.length()){
      return false;
    }
    HashMap<Character,Integer> hm = new HashMap<>();
    for(Character ch: str1.toCharArray()){
      if(hm.containsKey(ch)){
        hm.put(ch,hm.get(ch)+1);
      }else{
        hm.put(ch,1);
      }
    }
    for(Character ch: str2.toCharArray()){
      if(!hm.containsKey(ch)){
        return false;
      }
      hm.put(ch,hm.get(ch)-1);
    }
    for(int value: hm.values()){
      if(value != 0){
        return false;
      }
    }
    return true;
  }
}
class StringPractice{
  public static void main(String args[])throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("1.Reverse String\n2.toggle\n3.Palindrom\n4.wordCount\n5.maxWordLength");
    System.out.println("6.removeWhiteSpace\n7.ReverseWord\n8.CheckAngram\n");
    while(true){
      System.out.print("Enter Your Choice: ");
      int choice = Integer.parseInt(br.readLine());
      if(choice > 8 || choice <= 0){
        break;
      }
      System.out.print("Enter the string: ");
      String s1 = br.readLine();
      StringUtil obj = new StringUtil();
      switch(choice){
        case 1: 
          System.out.println("String after reversing: "+ obj.reverse(s1));
          break;
        case 2: 
          System.out.println("String after toggleCase: "+ obj.toggleCase(s1));
          break;
        case 3:
            if(obj.checkPalindrom(s1)){
              System.out.print("String is palindrom: ");
            }else{
              System.out.print("String is not palindrom: ");
            }
            break;
        case 4: 
          System.out.println("word count is: "+ obj.wordCount(s1));
          break;
        case 5: 
          System.out.println("maxWord length is: "+ obj.maxWordlength(s1));
          break;
        case 6:
          System.out.print("String after removing white space is: "+obj.removeWhiteSpace(s1));
          break;
        case 7:
          System.out.print(" reverse word String is: "+obj.reverseWord(s1));
          break;
        case 8:
          System.out.print("Enter the string: ");
          String s2 = br.readLine();
          if(obj.CheckAnagramUsingHashMap(s1,s2)){
            System.out.println("Strings are anagram : ");
          }else{
            System.out.println("Strings are not anagram : ");
          }
          break;
        default: 
          System.out.println("Invalid Choice\n");
      }
    }
  }
}