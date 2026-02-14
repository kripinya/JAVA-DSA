class binarySearchRecursive {
    int binarySearch(int arr[], int low, int high, int x){
        if(high>=low){
            int mid = (high+low)/2;
            if(arr[mid] == x)
            return mid;
            else if(arr[mid] > x)
            return binarySearch(arr, low, mid-1, x);

        else if(arr[mid] < x){
            return binarySearch(arr, mid+1, high, x);
        }
        }
        return -1;
    }
    public static void main(String[] args){
        binarySearchRecursive ob = new binarySearchRecursive();
        int arr[] = {12, 23, 30, 40, 45, 50, 55, 60};
        int n = arr.length;
        int x = 50;
        int result = ob.binarySearch(arr, 0, n-1, x);

        if(result == -1){
            System.out.println("Element is not present in array");
        }
        else
        System.out.println("Element is present at index " + result);
    }
}
