public class remove_duplicates_from_sorted {
    public static int removeDuplicate(int arr[]){
        if(arr.length == 0)
        return 0;
        int uniqueIndex = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[uniqueIndex]){
                uniqueIndex++;
                arr[uniqueIndex] = arr[i];
            }
        }
        return uniqueIndex +1;
    }
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5, 6, 6};
        int newLength = removeDuplicate(arr);
        System.out.println("Array after removing duplicates:");
        for(int i =0; i< newLength; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
