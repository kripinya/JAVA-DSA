import java.util.*;

class Sum {
public int[] twoSum(int[] nums, int target){
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i< nums.length; i++){
        int complement = target - nums[i];
        if(map.containsKey(complement)){
            return new int[] {map.get(complement), i};
        }
        map.put(nums[i], i);
    }
    return new int[]{};
}
}
public class TwoSum_optimal {
    public static void main(String[] args){
            int[] nums = {1, 2, 4, 5, 6, 7, 8};
            int target = 6;
            Sum s = new Sum();
            int[] result = s.twoSum(nums, target);
            if(result.length == 2) {
                System.out.println("indices:" + result[0] + " ," + result[1]);
            }else {
                System.out.println("no two numbers found that sum to target ");
            }
        }
}
