
public class BubbleSort {

    static void bubbleSort(int arr[], int n) {
        int i, j, temp;
       
        for (i = 0; i < n - 1; i++) {
             boolean swapped;
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }
    }

    static void printArray(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = {2, 4, 1, 5, 3};
        int n = arr.length;
        System.out.println("original array");
        printArray(arr, n);

        bubbleSort(arr, n);
        System.out.println("\nsorted array: ");
        printArray(arr, n);
    }
}
