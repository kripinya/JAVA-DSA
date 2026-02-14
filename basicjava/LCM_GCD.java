package basicjava;

import java.util.Scanner;

public class LCM_GCD {

    // Method to compute GCD using Euclidean algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to compute LCM
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);  // Using the relationship between GCD and LCM
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int gcdResult = gcd(a, b);
        int lcmResult = lcm(a, b);

        System.out.println("GCD of " + a + " and " + b + " is: " + gcdResult);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcmResult);

        sc.close();
    }
}
