import java.util.Scanner;

public class TwoSum {

    // Method inside same class
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if ((nums[i] + nums[j]) == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        // create object of SAME class
        TwoSum obj = new TwoSum();
        int[] result = obj.twoSum(nums, target);

        if (result[0] != -1) {
            System.out.println("Indices: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No solution found.");
        }

        sc.close();
    }
}