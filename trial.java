
class trial {

    static void bubbleSort(int arr[], int n) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped = false) {
                break;
            }
        }
    }

    static void printArray(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = {1, 5, 3, 2, 4};
        int n = arr.length;
        System.out.println("Original array");
        printArray(arr, n);
        bubbleSort(arr, n);
        System.out.println("\nSorted array:");
        printArray(arr, n);
    }
}
