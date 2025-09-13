//recursive approcah

public class BinarySearch2 {
    public int search(int arr[], int low, int high, int x){
        if(high >= low){
            int mid = low + (high -low)/ 2;
            //if the element is present at middle 
            if(arr[mid] == x){
                return mid;
            }
            //if element is smaller than mid then it can only be present in left subarray
            if(arr[mid] > x){
                return search(arr, low, mid - 1, x);
            }
            //if the element is present in the right subarray
            return search(arr, mid+1, high, x);
        }
        return -1;
    }
    public static void main(String[] args){
        BinarySearch2 a = new BinarySearch2();
        int arr[] = {1, 3, 4, 6, 8, 9, 445};
        int n = arr.length;
        int x = 8;
        int result = a.search(arr, 0, n -1, x);
        if(result == -1){
            System.out.println("element not present in the array.");

        } else {
            System.out.println("element is present at index " + result);
        }
    }
}
