public class MaxWealth {
    public static int maximumWealth(int accounts[][]){
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < accounts.length; i++){
            int sum = 0;
            for(int j = 0; j< accounts[i].length; j++){
                sum += accounts[i][j];
                //now we have sum of accounts of person.
            }
            //check with overall answer.
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[][] accounts = {
            {1,2}, {3, 5}, {4, 6}
        };
        int maxWealth = maximumWealth(accounts);
        System.out.println("max wealth is " + maxWealth);
    }
}
