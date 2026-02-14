public class LargestElement{
  public static int largest(int arr[]){
    int max = arr[0];
    for(int i = 0; i<arr.length; i++){
      if (arr[i] > max)
        max = arr[i];
    }
  return max;
  }
  public static void main(String[] args){
    int arr[] = {12, 23, 34, 45, 56, 67, 78, 89, 90};
    int result = largest(arr);
    System.out.println("largest element" + result);
  }
}
