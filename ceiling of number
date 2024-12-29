//ceiling of a number!!!
//ceiling = smallest element in array greater or equal to target element
//ceiling(arr, target=14) = 14
//ceiling(arr, target= 15) if 15 not there then return next greater element
//{2, 3, 5, 9, 14, 16, 18}

public class trial {

    public static int ceilingOfElement(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            }
        }
        return arr[low];
    }

    public static void main(String args[]) {
        int arr[] = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int result = ceilingOfElement(arr, target);
        System.out.println("Ceiling of " + target + " is " + result);
    }
}
