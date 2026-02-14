public class BinarySearch {
    public int search(int arr[], int target){
        
        int low = 0; 
        int high = arr.length-1;
        while(low <=high) {
            int mid = low + (high - low)/2;
            //check if x is present at mid 
            if(arr[mid] == target){
            return mid;
            }
                
            //if x greater, ignore left half
            if(arr[mid] < target){
                low = mid + 1;
            } 
            else {
                //if x is smaller, ignore right
                high = mid - 1;
            }
        }
        //if we reach here, then element was not present
        return -1;
    }
    public static void main(String[] args){
        //array must be sorted in asc order
        int arr[] = {1, 3, 5, 6, 8, 9};
        BinarySearch a = new BinarySearch();
        int result = a.search(arr, 3);
        if(result == -1){
            System.out.print("element not present in the array");

        }
        else {
            System.out.print("element present at index: " + result);
        }
    }
}
