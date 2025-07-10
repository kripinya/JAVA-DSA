//expected approach
import java.util.Scanner;
//find the number closest to n and divisible by m
public class ClosestNum2 {
 static int closest(int n, int m){
        int q = n /m;
        int n1 = m * q;//first possible closest number
        int n2 = (n*m) > 0 ? (m * (q + 1)) : (m * (q-1));//second possible closest num
        if(Math.abs(n-n1) < Math.abs(n-n2))
            return n1;//if true then n1 is the required closest number
        return n2;
}
    public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.println("enter 2 numbers: ");
   int n = sc.nextInt();
   int m = sc.nextInt();
   System.out.println(closest(n, m));
   sc.close(); 
}
}
