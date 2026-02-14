package basicjava;
import java.util.Scanner;
//we are given a cubic dice with 6 faces. all the individual faces have a number printed on them(1 to 6)
//we will be provided with the face of the cube, task is to guess the number on the opposite face of the cube.

//naive approach
public class DiceProblem {
public static int oppFaceNum(int n){
    int ans;
    if(n == 1){
        ans = 6;
    }
    else if(n == 2){
        ans = 5;
    }
    else if(n == 3){
        ans = 4;
    } else if(n == 4){
     ans = 3;
    } else if( n == 5){
        ans = 2;
    }
    else {
        ans = 1;
    }
    return ans;
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(oppFaceNum(n));
        sc.close();
    }
}
