package basicjava;
import java.util.*;

class Solution {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int input = sc.nextInt();

        Solution obj = new Solution();

        // Correct boolean check
        if (obj.isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        sc.close();
    }
}
// class Solution {
//     public int romanToInt(String s) {
//     int ans = 0, num = 0;
//     for(int i= s.length()-1; i>= 0; i--){
//         switch(s.charAt(i)){
//             case 'I': num = 1;
//             break;
//             case 'V': num = 5;
//             break;
//             case 'X': num = 10;
//             break;
//             case 'L': num = 50;
//             break;
//             case 'C': num = 100;
//             break;
//             case 'D': num = 500;
//             break;
//             case 'M': num = 1000;
//             break;
//         }
//         if(4*num < ans) ans -= num;
//         else ans += num;
//     }
//     return ans;
//     }
// }
