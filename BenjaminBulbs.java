import java.util.Scanner;


public class BenjaminBulbs {
public void bulb(int num){
    for(int i = 0; i*i <=num ; i++){
        System.out.println(i*i);
    }
}    
public static void main(String[] args){
System.out.println("enter number of bulbs:");
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
BenjaminBulbs b = new BenjaminBulbs();
b.bulb(num);

sc.close();
}
}
