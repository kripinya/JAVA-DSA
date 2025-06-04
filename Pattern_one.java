import java.util.Scanner;

public class Pattern_one {
    public void pattern(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
public static void main(String[] args){
    System.out.println("enter the no of rows you wanna add for the pattern");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Pattern_one a = new Pattern_one();
    a.pattern(n);
    sc.close();
}    
}
