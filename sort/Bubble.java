//simplest algo that works by repeatedly swapping the adjacent two elements 
//if they are in the wrong order
//not suitable for large datasets 
package sort;
public class Bubble {
    static void sort(int arr[]){
        int n = arr.length;
        boolean swapped;
        int i, j, temp;
        for( i = 0; i < n-1; i++){
            swapped = false;
            for(j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j +1]){
                     //swap arr[j] and arr[j+1]
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swapped = true;
                }
            }
        if(swapped == false)
        break;
        }
    }
    static void print(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {2, 5,1, 4,6, 8,7};
        sort(arr);
        print(arr);
        }
}
