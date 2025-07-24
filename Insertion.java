//works by iteratively inserting each element of an unsorted list into its correct position
//in a sorted portion of the list

public class Insertion {
    static void sort(int arr[]){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j = i -1;

            //move elements of arr[0..n], that are greater than the key to one pos ahead of their current pos
            while( j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = key;
        }
    }
    static void print(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        System.out.println("original array: ");
        int arr[] = {45, 23, 34, 12, 89, 67};
        print(arr);
        sort(arr);
        System.out.println("sorted array: ");
        print(arr);
    }
}