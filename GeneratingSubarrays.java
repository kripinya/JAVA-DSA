//task is to generate all the possible subarrays of the given array

public class GeneratingSubarrays {
    //iterative approach
    static void subArray(int arr[]){
        int n = arr.length;
        //pick starting point
        for(int i = 0; i < n; i++){
            //pick ending point 
            for(int j = i; j < n; j++){
                //print subarray between current starting and ending points
                for(int k= i; k <= j; k++){
                    System.out.print(arr[k] + " ");

                }
                System.out.println();
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("println all non-empty subarrays");
        subArray(arr);
    }
}
