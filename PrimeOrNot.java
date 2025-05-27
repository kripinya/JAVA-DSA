import java.util.Scanner;

public class PrimeOrNot {
    public void isPrime(int num){
        if(num<=1){
            System.out.println("not prime");

        }
        boolean isPrime = true;
        for(int i = 2; i < num/2; i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Prime");
        
        } else {
            System.out.println("Not prime");
        }
    }
public static void main(String[] args){
    System.out.println("enter a number to check for prime");
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
PrimeOrNot a = new PrimeOrNot();
a.isPrime(num);
sc.close();
}    
}
