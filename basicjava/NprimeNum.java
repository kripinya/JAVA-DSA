package basicjava;
import java.util.Scanner;

public class NprimeNum {
public void nPrime(int n){
    for(int i = 2; i<= n; i++){
       boolean isPrime = true;
       for(int j = 2; j <= i/2; j++){
        if (i % j == 0) {
                    isPrime = false;
                    break;
       }
    }
    if(isPrime){
        System.out.println(i + " ");
    }
}
}
    public static void main(String args[]){
        System.out.println("Enter the number till where you want to find the prime numbers:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        NprimeNum a = new NprimeNum();
        a.nPrime(n);
        sc.close();
    }
}
