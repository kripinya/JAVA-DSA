//given an array of size n, task is to find all the leaders in array. 
//Leader is an element if it is greater than or equal to all the elements to its right side.
//rightmost element is always a leader.
//in arr[] = {1, 2, 4, 5, 2} // output is [5, 2]
import java.util.*;

public class LeaderInArray1 {
    public void leader(int arr[]) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < arr.length; j++) {  // ✅ Fix condition
                if (arr[i] < arr[j]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                result.add(arr[i]);  // ✅ Add to result
            }
        }

        System.out.println("Leaders: " + result);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 2};
        LeaderInArray1 a = new LeaderInArray1();
        a.leader(arr);
    }
}
