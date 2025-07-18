//using two pointer
public class ReverseArr_2 {
    static void reverse(int arr[]){
        //initialize 
        int left = 0; 
        int right = arr.length -1;
        //iterate till left is less than right
        while(left < right){
            //swap the elements at left and right position
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            //increment the left pointer
            left++;
            //decrement the right pointer
            right--;
        }

    }
    public static void main(String[] args){
        int arr[] = {1, 2, 4, 5, 6, 7};
        
        reverse(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
