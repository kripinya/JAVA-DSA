package basicjava;
import java.util.Scanner;

public class DecimalToAnyBase {
    public void convert(int n, int b){
        if (n == 0) {
    System.out.print("0");
    return;
}
        int[] digits = new int[100];
int index = 0;

while(n > 0){
    digits[index] = n % b;
    n = n / b;
    index++;
}

for(int i = index - 1; i >= 0; i--){
    System.out.print(digits[i]);
}
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the decimal number");
        int n = sc.nextInt();
        System.out.println("enter the base in which you want to concert the decimal number:");
        int b = sc.nextInt();
        DecimalToAnyBase a = new DecimalToAnyBase();
        a.convert(n, b);
        sc.close();
    }
}
