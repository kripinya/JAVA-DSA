//Given a positive integer n, we have to find the sum of squares of first n natural numbers.

import java.util.Scanner;
//naive approach
//to run a loop from 1 to n and sum up all the squares. 
public class SumOfSqofN {
    static int findSum(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += (i*i);
        }
        return sum;
    }
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number till where u want to find the sum: ");
        int n = sc.nextInt();
        System.out.println(findSum(n));
        sc.close();
     }
}
