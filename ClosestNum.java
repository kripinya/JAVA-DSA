import java.util.Scanner;
//find the number closest to n and divisible by m
public class ClosestNum {
 static int closest(int n, int m){
        int closest = 0;
        int minDifference = Integer.MAX_VALUE;
        //check numbers around n
        for(int i = n-Math.abs(m); i<= n+Math.abs(m); ++i){
            if(i%m == 0){
                int difference = Math.abs(n-i);
            
            if(difference < minDifference || (difference == minDifference && Math.abs(i)> Math.abs(closest))){
                closest = i;
                minDifference = difference;
            }
        }
    }
        return closest;
}
    public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.println("enter 2 numbers: ");
   int n = sc.nextInt();
   int m = sc.nextInt();
   System.out.println(closest(n, m));
   sc.close(); 
}
}
