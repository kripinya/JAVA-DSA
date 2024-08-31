public class linearSearch {
 public static int search(int arr[], int n, int key)   {
    for(int i = 0; i<n; i++){
        if(arr[i] == key)
        return i;
    }
    return -1;
 }
 public static void main(String[] args){
    int arr[] = {2, 5, 6, 3, 8};
    int n = arr.length;
    int key = 6;
    int result = search(arr, n, key);
    if(result == -1)
        System.out.println("element not found");
    else
    System.out.println("element found at index " + result);
 }
}
