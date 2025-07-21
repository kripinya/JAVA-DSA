//selection sort
//comparison based sorting algo, sorts an array 
//by repeatedly selecting the smallest or largest element from the unsorted portion 
//and swapping it with the first unsorted element
//this process continues till the entire array is sorted.

public class SelectionSort {
    public void sort(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            //assume the current position holds the min element
            int min_idx = i;
            //iterate through the unsorted portion to find the actual minimum
            for(int j =i+1; j < n; j++){
                if(arr[j] < arr[min_idx]){
                    //update min idx if a smaller element is found
                    min_idx = j;
                }
            }
            //move minimum element to its correct position
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;

        }

    }
    static void print(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {1, 4, 3, 6, 7, 2, 10};
        SelectionSort a = new SelectionSort();
        a.sort(arr);
        print(arr);
    }
}
