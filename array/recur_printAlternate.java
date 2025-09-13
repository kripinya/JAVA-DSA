public class Main {
  public static void printAlternate(int[] arr, int index){
  if(index > arr.length){
  return;
  }
  System.out.println(arr[index] + " ");
  printAlternate(arr, index+2);
  }
  public static void main(String[] args){
  int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
  System.out.println("alternate elements");
  printAlternate(arr, 0);
  }
}
