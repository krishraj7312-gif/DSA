class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindrome
        if (x < 0) return false;

        int xcopy = x;
        int rev = 0;

        while (x > 0) {
            int rem = x % 10;          // get last digit
            rev = (rev * 10) + rem;   // build reverse
            x = x / 10;               // remove last digit
        }

        return xcopy == rev;
    }
}