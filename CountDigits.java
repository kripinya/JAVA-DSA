import java.util.Scanner;

public class CountDigits {
    public void count(int num){
     int count = 0; 
     if(num < 0){
        num = -num;
     }   
     if(num == 0){
        count = 1;

     } else {
        while(num > 0){
            num= num/10;
            count ++;
        }
     }
     System.out.println("Number of digits: " + count);
    }
 public static void main(String[] args){
    System.out.println("enter a number : ");
    Scanner sc = new Scanner(System.in);
    int num  = sc.nextInt();
    CountDigits a = new CountDigits();
    a.count(num);
    sc.close();
    
 }
}
