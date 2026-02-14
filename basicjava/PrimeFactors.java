package basicjava;
import java.util.Scanner;

public class PrimeFactors {

    public static void findPrimeFactors(int n) {
        System.out.print("Prime factors of " + n + " are: ");

        // Step 1: Handle factor 2 separately
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        // Step 2: Check odd numbers from 3 onwards
        for (int i = 3; i <= n / i; i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        // Step 3: If remaining n is a prime number > 2
        if (n > 2) {
            System.out.print(n);
        }

        System.out.println(); // move to new line
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find its prime factors: ");
        int number = sc.nextInt();

        findPrimeFactors(number);

        sc.close();
    }
} 
