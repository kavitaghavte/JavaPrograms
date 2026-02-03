import java.util.Scanner;
class ArrayUtil{
  void printArray(int arr[][]){
    System.out.println("Element in Jagged 2D-Array is: ");
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr[i].length; j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.print("\n");
    }
  }
}
class ArrayJagged2D{
  public static void main(String args[])
  {
    int row, col;
    int arr[][];
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of row: ");
    row = sc.nextInt();
    arr = new int[row][];
    for(int i=0; i<row; i++){
      System.out.print("Enter the size of columns for row "+i+": ");
      col = sc.nextInt();
      arr[i] = new int[col];
      System.out.println("Enter array element for row "+i+": ");
      for(int j=0; j<col; j++){
        arr[i][j] = sc.nextInt();
      }
    }
    System.out.println("1.Print Array");
    while(true){
      System.out.print("Enter Your Choice: ");
      int choice = sc.nextInt();
      if(choice > 4 || choice <= 0){
        break;
      }
      ArrayUtil obj = new ArrayUtil();
      switch(choice){
        case 1: 
          obj.printArray(arr);
          break;
        default: 
          System.out.println("Invalid Choice\n");
      }
    }
  }
}