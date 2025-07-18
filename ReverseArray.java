//task is to reverse the array
//using a temp array
public class ReverseArray {
    static void reverseArr(int[] arr){
        int n = arr.length;
        //temp arr to store elements in reversed order
        int[] temp = new int[n];
        //copy elements from original array to temp in reverse order
        for(int i = 0; i<n; i++){
            temp[i] = arr[n-i-1];
        }
        //copy elements back to original array
        for(int i = 0; i < n; i++){
            arr[i] = temp[i];
        }
    }
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        reverseArr(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
