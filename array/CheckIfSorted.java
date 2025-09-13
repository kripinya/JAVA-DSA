//task is to check if it is sorted in ascending order or not.

public class CheckIfSorted {
    public boolean ifSorted(int arr[], int n){
        //if array has one or no element
        if(n == 0|| n==1){
            return true;
        }
        for(int i = 1; i < n; i++){
            //unsorted pair found
            if(arr[i-1 ] > arr[i]){
                return false;
            }
        //no unsorted pair found
        }
        return true;
    }
    public static void main(String[] args){
        int arr[] = {12, 45, 56, 67, 78, 89};
        int n = arr.length;
        CheckIfSorted aa = new CheckIfSorted();
        boolean a = aa.ifSorted(arr, n);
        if(a == true){
            System.out.println("sorted");
        } else {
            System.out.println("false");
        }
    }
}
