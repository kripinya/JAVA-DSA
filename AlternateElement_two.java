//recursive approach
//printing alternate elements using recursion starting from index 0 and print its value then we call recursive function again with (index+2) as the current index. 
public class AlternateElement_two {
    public void alternateElement(int arr[], int i){
        if(i<arr.length){
            System.out.println(arr[i]);
            alternateElement(arr, i+2);
        }
    }
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5, 6};
        AlternateElement_two a = new AlternateElement_two();
        a.alternateElement(arr, 0); // Start from index 0
    }
}
