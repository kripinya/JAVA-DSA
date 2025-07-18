//goal is to rearrange the array so that all disticnt elements appear at the beginning in sorted order.


public class RemoveDuplicate {
    public int removeDuplicate(int arr[]){
        int n = arr.length;
        if(n< 1)
        return n;
        //start from second element 
        int index = 1;
        for(int i = 1; i < n; i++){
            if(arr[i] != arr[i-1]){
                arr[index++] = arr[i];
            }
        }
        return index;
    }
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 3, 4, 5, 6};
        RemoveDuplicate a = new RemoveDuplicate();
        int newSize = a.removeDuplicate(arr);
        for(int i = 0; i< newSize; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
