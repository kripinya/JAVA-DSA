public class iter_printAlternatives {
    //to print alternate element of the array starting from the first element.
    public static void printAlternativeIterative(int[] arr){
        System.out.println("Alternative elements(iterative):");
        for(int i = 0; i< arr.length; i+=2){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printAlternativeIterative(arr);
    }
}
