//program to print a table of number n
//interative approach
import java.util.Scanner;

public class PrintTable {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number whose table is to be printed");
        int n = sc.nextInt();
        for(int i = 1; i<= 10; i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }
        sc.close();

    }
}
