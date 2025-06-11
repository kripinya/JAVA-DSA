import java.util.Scanner;

public class Pattern_six {
    public void pattern(int n){
        //upper half
        for(int i = 1; i <= n; i+=2){
            //printing leading spaces
            for(int j = 0; j < (n-i)/2; j++){
                System.out.print("  ");
            }
            //printing stars with spacing 
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //for lower half
        for(int i = n-2; i >= 1; i-=2){
            //print leading spaces
            for(int j = 0; j < (n-i)/2; j++){
                System.out.print("  ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd number of rows for the diamond: ");
        int n = sc.nextInt();

        // Input validation: diamond needs odd number of rows
        if (n % 2 == 0) {
            System.out.println("Please enter an odd number.");
        } else {
            Pattern_six a = new Pattern_six();
            a.pattern(n);
        }

        sc.close();
    }
}
