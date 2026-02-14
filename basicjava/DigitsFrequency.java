import java.util.Scanner;

public class DigitsFrequency {
    public static int getDigitFreq(int n, int d){
        int rv = 0;
        while (n > 0){
            int dig = n % 10;
            n = n / 10;
            if(dig == d){
                rv++;
            }
        }
        return rv;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        
        int result = getDigitFreq(n, d); // call static method directly
        System.out.println(result); // print the result

        sc.close();
    }
}
