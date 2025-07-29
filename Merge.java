//follows divide and conquer approach, works by recursively dividing the input array into halves recursively sorting the two halves and finally merging them back together again to pbtain the sorted array.

public class Merge{
    static void merge(int arr[], int l, int m, int r){
        //find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
        //create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        //copy data to temp arrays
        for(int i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for(int j = 0; j< n2; j++)
            R[j] = arr[m + 1 + j];
        
        //merge the temp arrays intial indices of forst and second subarrays
        int i = 0; 
        int j = 0;

        //initial index of merged subarray array
        int k = l;
        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i< n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        //copy remaining elements of R[] if any
        while(j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    static void mergeSort(int arr[], int l, int r){
        if(l < r){
            int m = l + (r -l) /2;
            //sort first and second half
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            //energe the sorted arrays
            merge(arr,l, m, r);
        }
    }
    public static void main(String args[]){
        int arr[] = {38, 27, 43, 10};
        mergeSort(arr, 0, arr.length -1);
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}