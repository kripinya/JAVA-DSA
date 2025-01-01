class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int original = x;
        int reversed = 0;
        while(x!=0){
            int digit = x%10;
            reversed = digit + reversed*10;
            x = x/10;
        }
        return original == reversed;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input integer from the user
        System.out.print("Enter an integer: ");
        int input = sc.nextInt();

        // Check if the integer is a palindrome
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        sc.close(); // Close the scanner
    }
}
