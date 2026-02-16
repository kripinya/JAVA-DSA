package sort;
public class Quick {
    static int partition(int arr[], int low, int high){
        //choose the pivot
        int pivot = arr[high];
        //index of smaller element and indicates the right position of pivot found so far
        int i = low -1;
        //traverse arr and move all smaller elements to the left side. 
        //elements from low i are smaller after every iteration
        for(int j = low; j <= high -1; j++){
            if(arr[j] < pivot){
                i++;
                swap(arr, i , j);

            }
            
        }
        //move pivot after every smaller elements and return its position
        swap(arr, i +1, high);
            return i+1;
    }
        //swap
        static void swap(int arr[], int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        static void quickSort(int arr[], int low, int high){
            if(low < high){
                //pi is the partition return index
                int pi = partition(arr, low, high);
                //recursion calls for smaller elements and greater or equal elements
                quickSort(arr, low, pi -1);
                quickSort( arr, pi+1, high);
            
            }

        }
        static void printArray(int arr[]){
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        public static void main(String args[]){
            int[] arr = {3, 4, 1, 5, 2};
            System.out.println("original array:");
            printArray(arr);
            int n = arr.length;
            quickSort(arr, 0, n-1);
            System.out.println("sorted array: ");
            printArray(arr);
        }
}
