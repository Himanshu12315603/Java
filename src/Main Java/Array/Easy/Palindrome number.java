class Solution {
    public boolean isPalindrome(int x) {
        // Edge case: negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        int rev = 0;
        int copy = x;

        // Reverse the integer
        while (x > 0) {
            int rem = x % 10; // Get the last digit
            rev = rev * 10 + rem; // Append the digit to the reversed number
            x /= 10; // Remove the last digit
        }

        // Check if the reversed number is equal to the original number
        return (rev == copy);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        int[] testNumbers = {121, -121, 10, 12321, 1234321};

        for (int num : testNumbers) {
            boolean result = solution.isPalindrome(num);
            System.out.println("Is " + num + " a palindrome? " + result);
        }
    }
}
