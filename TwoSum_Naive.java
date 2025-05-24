//Given an array of integers nums and an integer target, return indices of two numbers such that they add up to the target.

import java.util.Arrays;
class Sum {
    public int[] twoSum(int[] nums, int target){
        for(int i = 0; i< nums.length; i++){
            for(int j = i + 1; j< nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}
    public class TwoSum_Naive {
        public static void main(String[] args){
            int[] nums = {0,1,2, 3, 4, 5};
            int target = 5;
            Sum s = new Sum();
            int[] result = s.twoSum(nums, target);
            System.out.println("indices: " + Arrays.toString(result));
        }
    }
