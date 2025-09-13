import java.util.Scanner;

public class AnyBaseToDecimal {
    public void convert(int n, int b){
        int decimal = 0;
        int power = 1; // Represents b^0 initially

        while(n > 0){
            int digit = n % 10;
            decimal += digit * power;
            power = power * b; // Next power of base
            n = n / 10;
        }

        System.out.println("Decimal equivalent: " + decimal);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number in base b:");
        int n = sc.nextInt();
        System.out.println("Enter the base (b):");
        int b = sc.nextInt();

        AnyBaseToDecimal a = new AnyBaseToDecimal();
        a.convert(n, b);

        sc.close();
    }
}
