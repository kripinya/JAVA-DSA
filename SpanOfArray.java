import java.util.Scanner;
//The span of an array is the difference between the maximum and minimum elements in the array.

class Smallest{
    int small(int arr[]){
        int min = arr[0];
        for(int i = 1; i < arr.length ; i++){
            if(arr[i] < min){
                min = arr[i];
            }

        }
        return min;

    }
}
public class SpanOfArray {
    public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the size of the array:");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the elements of the array:");
    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();

    }
    Smallest s = new Smallest();
    int min = s.small(arr);
    int max = arr[0];
    for(int i = 1; i < n; i++){
        if(arr[i] > max){
            max = arr[i];   
        }
    }
     int span = max - min;
    System.out.println("The span of the array is: " + span);
    sc.close();
}
   
    }


