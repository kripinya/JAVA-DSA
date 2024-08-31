//to search an element in unsorted array

class search {

    static int findElement(int arr[], int n, int key) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {12, 23, 34, 45, 40};
        int n = arr.length;
        int key = 23;

        int position = findElement(arr, n, key);

        if (position == -1) {
            System.out.print("Element not found");
        } else {
            System.out.print("Element found at position : " + (position + 1));
        }
    }
}
