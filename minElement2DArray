import java.util.Arrays;
public class minElement2D {
    public static int[] minElement(int[][] arr){
        int[] min = {arr[0][0], 0, 0};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min[0]) {
                    min[0] = arr[i][j];
                    min[1] = i;
                    min[2] = j;
                }
            }
        }
        return min;
    }
public static void main(String[] args){
    int[][] arr = {
        {90, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    int[] min = minElement(arr);
    System.out.println("minimum element is" + Arrays.toString(new int[]{min[1], min[2]}));
}
}
