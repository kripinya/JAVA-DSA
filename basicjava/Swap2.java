package basicjava;
import java.util.*;
public class Swap2 {
    public void swap(int a, int b){//let a= 2, b = 3 
        a = a + b;//5
        b = a - b;//2
        a = a -b;//3
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int a = sc.nextInt();
        System.out.println("enter another number: ");
        int b = sc.nextInt();
        Swap2 s = new Swap2();
        s.swap(a, b);
        sc.close();
    }
}
