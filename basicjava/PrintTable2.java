//print a table with the number n
//recursive approach
package basicjava;
import java.util.Scanner;
public class PrintTable2{
    static void printtable(int n, Integer... val){
        int i = 1;
        if(val.length != 0)
        i = val[0];
        if(i == 11)
        return;
        System.out.println(n + " * " + i + " = " + n*i);
        i++;
        printtable(n, i);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printtable(n);
        sc.close();
    }
}
