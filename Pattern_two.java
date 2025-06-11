
import java.util.Scanner;

public class Pattern_two{
    public void pattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
public static void main(String[] args){
    System.out.println("enter the no of rows you wanna add for the pattern");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Pattern_two a = new Pattern_two();
    a.pattern(n);
    sc.close();
}    
}
