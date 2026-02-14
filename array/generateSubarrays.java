package array;
public class GenerateSubarrays {

    public static void generateSubarrays(int arr[], int start, int end) {

        if (start == arr.length) {
            return;
        }

        if (end == arr.length + 1) {
            generateSubarrays(arr, start + 1, start + 2);
            return;
        }

        printSubarray(arr, start, end);
        generateSubarrays(arr, start, end + 1);
    }

    public static void printSubarray(int arr[], int start, int end) {
        for (int i = start; i < end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};

        System.out.println("Print all possible subarrays:");
        generateSubarrays(arr, 0, 1);   // ← fixed
    }
}
