import java.util.Scanner;

public class PythagoreanTriplets {

    public static boolean isPythagoreanTriplet(int a, int b, int c) {
        int max = a;
        int x = b, y = c;

        // Manually find the max number and assign other two
        if (b > max) {
            max = b;
            x = a;
            y = c;
        }
        if (c > max) {
            max = c;
            x = a;
            y = b;
        }

        // Check if it's a Pythagorean triplet: max^2 == x^2 + y^2
        return (max * max == x * x + y * y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three integers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (isPythagoreanTriplet(a, b, c)) {
            System.out.println("Yes, these form a Pythagorean triplet.");
        } else {
            System.out.println("No, these do not form a Pythagorean triplet.");
        }

        sc.close();
    }
}
