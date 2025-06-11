import java.util.Scanner;
/* 
* * * * *
  * * * *
    * * *
      * *
        *
*/
public class Pattern_four {
    public void pattern(int n) {
        for (int i = 0; i < n; i++) {
            // Print leading spaces (2 spaces per level of indentation)
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            // Print stars (n - i stars per row)
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }

            System.out.println(); // Move to the next line
        }
    }
public static void main(String args[]){
    System.out.println("enter no of rows you want in the pattern:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Pattern_four a = new Pattern_four();
    a.pattern(n);
    sc.close();
}
}
