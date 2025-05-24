

//given a binary array, find the max no of consecutive ones

public class MaxConsecutiveOnes {
    public int maxOnes(int [] nums){
        int maxCount = 0;
        int count = 0;
         for(int num : nums){
            if(num == 1) {
            count ++;
            maxCount = Math.max(maxCount, count);
         } else {
            count = 0;
         }
        }
        return maxCount;
    }
    public static void main(String args[]){
        int nums[] = {1, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1};
        MaxConsecutiveOnes o = new MaxConsecutiveOnes();
        int result = o.maxOnes(nums);
        System.out.println("max no of consecutive ones are : " + result);
    }
}
