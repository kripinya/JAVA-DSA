package basicjava;
import java.util.Scanner;


public class EvenOdd {
    public boolean isEven(int n){
        if(n%2 == 0){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is even or odd:");
        int num = sc.nextInt();
        EvenOdd obj = new EvenOdd();
        if(obj.isEven(num)){
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
        sc.close();
    }
}
