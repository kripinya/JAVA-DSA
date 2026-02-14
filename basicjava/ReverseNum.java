package basicjava;
import java.util.Scanner;

public class ReverseNum {

    public void reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append it to the reversed number
            number /= 10; // Remove the last digit from the original number
        }
        System.out.println("Reversed number: " + reversedNumber);
    }

    public static void main(String[] args) {
        System.out.println("Enter a number to reverse:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        ReverseNum a = new ReverseNum();
        a.reverse(number);
        scanner.close();
    }
}
