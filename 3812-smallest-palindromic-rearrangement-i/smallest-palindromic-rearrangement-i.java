class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];
        
        // Count the frequency of each character
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        
        StringBuilder left = new StringBuilder();
        char mid = 0;
        
        // Iterate through 'a' to 'z' to ensure lexicographical order
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0) {
                mid = (char) ('a' + i);
            }
            
            // Append half of the character count to the left half
            for (int j = 0; j < freq[i] / 2; j++) {
                left.append((char) ('a' + i));
            }
        }
        
        // Create the right half by reversing the left half
        String right = new StringBuilder(left).reverse().toString();
        
        // Assemble the full palindrome
        if (mid != 0) {
            return left.toString() + mid + right;
        }
        return left.toString() + right;
    }
}