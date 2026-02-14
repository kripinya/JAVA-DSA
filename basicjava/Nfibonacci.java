import java.util.Scanner;

public class Nfibonacci {
public void fibonacciNum(int n){
    int a =0; 
    int b = 1;
    if(n>=0){
        System.out.println(a);
    } 
    if(n>=1){
        System.out.println(b);
    } 
    int next = a + b;
    while(next <= n){
        System.out.println(next + " ");
        a = b;
        b = next;
        next = a + b;
    }
}
    public static void main(String[] args){
        System.out.println("enter the number till where you want to find the fibonacci numbers: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Nfibonacci a = new Nfibonacci();
        a.fibonacciNum(n);
        sc.close();
    }
}
