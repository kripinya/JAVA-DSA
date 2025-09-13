//alternate elements of an array
//Given an array arr[], 
//the task is to print every alternate element of the array starting from the first element.
//iterative approach
public class AlternateElement_one {
    public void printAlternate(int arr[]){
        for(int i = 0; i<arr.length; i+=2){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4, 5, 6};
        AlternateElement_one a = new AlternateElement_one();
        a.printAlternate(arr);
    }
}
