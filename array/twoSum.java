import java.util.Scanner;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i<nums.length; i++){
            for(int j = i+ 1; j< nums.length; j++){
                if((nums[i]+ nums[j])== target){
                    return new int[] {i, j};
                } 
            }
             
        }
        return new int[] {-1, -1};
    }
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the length of the array
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Declare the array and input values
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input the target value
        System.out.print("Enter the target value: ");
        int target = sc.nextInt();

        // Call the twoSum method
        int[] result = twoSum(nums, target);

        // Display the result
        if (result[0] != -1) {
            System.out.println("Indices of the two numbers that add up to the target: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No solution found.");
        }

        sc.close(); // Close the scanner
    }
}
