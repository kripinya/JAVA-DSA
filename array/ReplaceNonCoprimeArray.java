/*You are given an array of integers nums. Perform the following steps:

Find any two adjacent numbers in nums that are non-coprime.
If no such numbers are found, stop the process.
Otherwise, delete the two numbers and replace them with their LCM (Least Common Multiple).
Repeat this process as long as you keep finding two adjacent non-coprime numbers.
Return the final modified array. It can be shown that replacing adjacent non-coprime numbers in any arbitrary order will lead to the same result.

The test cases are generated such that the values in the final array are less than or equal to 108.

Two values x and y are non-coprime if GCD(x, y) > 1 where GCD(x, y) is the Greatest Common Divisor of x and y.*/

import java.util.*;

class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> stack = new ArrayList<>();

        for (int num : nums) {
            stack.add(num);

            // keep merging while last two are non-coprime
            while (stack.size() > 1) {
                int a = stack.get(stack.size() - 1);
                int b = stack.get(stack.size() - 2);

                int g = gcd(a, b);
                if (g > 1) {
                    // merge into LCM
                    int lcm = (int)((long)a * b / g);
                    stack.remove(stack.size() - 1); // remove a
                    stack.remove(stack.size() - 1); // remove b
                    stack.add(lcm);
                } else {
                    break;
                }
            }
        }

        return stack;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
