import java.util.Scanner;

class RotateNum {
    public void rotate(int num, int x) {
        int temp = num;
        int digits = 0;

        // Count number of digits
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }

        // Normalize rotations
        x = x % digits;
        if (x < 0) {
            x += digits; // Convert negative to equivalent positive rotation
        }

        // Calculate div = 10^x and mult = 10^(digits - x) without Math.pow
        int div = 1;
        for (int i = 0; i < x; i++) {
            div *= 10;
        }

        int mult = 1;
        for (int i = 0; i < digits - x; i++) {
            mult *= 10;
        }

        // Split number and rotate
        int right = num % div;
        int left = num / div;

        int rotated = right * mult + left;

        System.out.println("Rotated number: " + rotated);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number (at least two digits): ");
        int num = sc.nextInt();

        System.out.println("Enter number of rotations (positive = right, negative = left): ");
        int x = sc.nextInt();

        RotateNum a = new RotateNum();
        a.rotate(num, x);

        sc.close();
    }
}
