public class countEvenNoInArray {
    public static int findEven(int arr[]){
        int n = arr.length;
        int count = 0;
        for(int i = 0; i<n; i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int arr[] = {12, 23, 34, 45, 56, 67, 78, 89};
        int evenCount = findEven(arr);
        System.out.println("total even no in the array are " + evenCount);
    }
}
