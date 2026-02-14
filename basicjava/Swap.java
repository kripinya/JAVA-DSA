package basicjava;
import java.util.Scanner;
//naive approach- Using Third Variable
public class Swap {
    public void swap(int a, int b){
        int x = a;
        a = b;
        b = x;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int a = sc.nextInt();
        System.out.println("enter another number: ");
        int b = sc.nextInt();
        Swap s = new Swap();
        s.swap(a, b);
        sc.close();
    }
}
