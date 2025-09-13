//types of array rotation-

//rotate one by one 
// class RotateOne {
//     public void rotate(int arr[], int d){
//         int n = arr.length;
//         for(int i = 0; i < d; i++){
//             //right rotate the array d times
//             int last = arr[n-1];
//             for(int j = n-1; j > 0; j--){
//                 arr[j] = arr[j-1];
//             }
//             arr[0] = last;
//         }
//     }
// }

//using temporary array
// class TempArr{
//     public void rotateArr(int[] arr, int d){
//         int n = arr.length;
//         //handle case when d>n
//         //storing rotated version of array
//         int[] temp = new int[n];
//         //copy last d elements to the front of temp
//         for(int i = 0; i<d; i++){
//             temp[i] = arr[n-d + i];
            
//             }
//             //copy the first n-d elements to the back of temp
//             for(int i = 0; i < n-d; i++){
//                 temp[i+d] = arr[i];
//             }
//             //copying the elements of temp in arr to get the 
//             //final array
//             for(int i = 0; i < arr.length; i++){
//                 arr[i] = temp[i];
//         }
//     }
// }
//the reversal algo
class Reversal {
    public void rotate(int[] arr, int d){
        int n = arr.length;
        d %= n;
        //reverse the entire array
        reverse(arr, 0, n-1);
        reverse(arr, 0, n-1);
        reverse(arr, d, n-1);
    }
    public void reverse(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

public class RotateArray {

    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5, 6, 7};

        /*RotateOne a = new RotateOne();
        // a.rotate(arr, 1);
        // for(int i = 0; i<arr.length; i++){
        //     System.out.print(arr[i] + " ");
        */
        //using temp array
        // TempArr t = new TempArr();
        // t.rotateArr(arr, 1);
        // for(int i = 0; i < arr.length; i++){
        //     System.out.print(arr[i]+ " ");
        // }
        // System.out.println();

        //reversal algo
        Reversal a = new Reversal();
        a.rotate(arr, 2);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
