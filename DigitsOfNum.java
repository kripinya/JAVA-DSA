import java.util.Scanner;


public class DigitsOfNum {
public void digits(int num){
int reversed = 0; 
while(num > 0){
    int digit = num%10;
    reversed = reversed * 10 + digit;
    num = num /10;
} while(reversed > 0){
    int digit = reversed %10;
    System.out.println(digit);
    reversed = reversed /10;
}
}   
public static void main(String[] args){
System.out.println("enter a number : ");
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
DigitsOfNum a = new DigitsOfNum();
a.digits(num);
sc.close();
} 
}
