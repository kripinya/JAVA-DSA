import java.io.*;
 class binarySearchIterative {
        int binarySearch(int arr[], int x){
            int low = 0;
            int high = arr.length -1;
            while (low <= high) {
                int mid = (low + high)/2;
                if(arr[mid] == x){
                    return mid;
                } else 
                if(arr[mid] < x){
                    low = mid + 1;
                    } else {
                        high = mid - 1;
                        }
    }
    return -1;
    }
    public static void main(String[] args){
        binarySearchIterative obj = new binarySearchIterative();
        int arr[] = {10, 20, 30, 40, 50, 60, 70};
        int x = 30;
        int n = arr.length;
        int result = obj.binarySearch(arr, x);
        if(result == -1){
            System.out.println("Element is not present in array");
        }
        else
        System.out.println("Element is present at position " + (result+1) );
    }
 }
