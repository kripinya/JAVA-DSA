
public class bsearchOperation {
    //best case = O(1);
//find the max no of such comparisons in worst case.
// total comparisons in worst case = log n

    public static int binarySearch(int arr[], int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 6, 7, 8, 9};
        int target = 6;
        int result = binarySearch(arr, target);
        if(result == -1){
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Element is present at index " + result);
        }
    }
}
