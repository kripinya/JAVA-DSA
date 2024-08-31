import java.util.Scanner;
public class reverseArray {
    public static void reverseArr(int arr[], int n){
        int temp;
        for(int i = 0; i<n/2; i++){
            temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1]= temp;
        }
    }
    public static void printArr(int arr[], int n){
        for(int i = 0; i<n; i++)
        System.out.print(arr[i]+ " ");
    }
    public static void main(String[] args){
        System.out.println("Enter no of elements for array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array: ");
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("original array - ");
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

        reverseArr(arr, n);
        System.out.println("\nreversed array: ");
        printArr(arr, n);

        sc.close();
    }
}
