//Given a positive integer n, we have to find the sum of squares of first n natural numbers.

import java.util.Scanner;
//expected approach(formula based approach)
//use the mathematical formulae for the sum of squares of first n natural numbers.n(n+1)(2n+1) / 6
public class SumOfSqofN2 {
    public static int findSum(int n){
        return (n*(n+1))* (2 *n +1 )/6;
    }
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number till where u want to find the sum: ");
        int n = sc.nextInt();
        System.out.println(findSum(n));
        sc.close();
     }
}
