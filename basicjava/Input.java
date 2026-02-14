package basicjava;
import java.util.Scanner;

public class Input {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How old are you?");
        int a = sc.nextInt();
        sc.nextLine();  // Consume the leftover newline

        System.out.println("Oh, you are " + a + " years old!");
        System.out.println("And what is your name?");
        String name = sc.nextLine();

        System.out.println(name + ", oh such a beautiful name!!");
        
        sc.close();
    }
}
