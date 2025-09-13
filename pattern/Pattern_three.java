import java.util.Scanner;

public class Pattern_three {
    public void Pattern(int n){
    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= n-i; j++){
            System.out.print("  ");
        }
        for(int j = 1; j<=i; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
}    

public static void main(String args[]){
    System.out.println("enter no of rows you want in the pattern:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Pattern_three a = new Pattern_three();
    a.Pattern(n);
    sc.close();
}
}
