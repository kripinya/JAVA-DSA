import java.util.Scanner;

public class Test {
    public void printDigit(int n){
        int reversed = 0;
        while(n > 0){
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            System.out.println(digit);
            n = n/10;
        }
        // while(reversed > 0){
        //     int digit = reversed %10;
        //     System.out.println(digit);
        //     reversed = reversed /10;
        // }
    }
    
public static void main(String[] args){
    System.out.println("enter a number: ");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
Test a  = new Test();
a.printDigit(n);
sc.close();
}    
}
