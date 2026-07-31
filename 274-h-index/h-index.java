import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {
        // Sort the citations in ascending order first
        Arrays.sort(citations);
        
        int n = citations.length;
        
        // Iterate from the highest citation to the lowest
        for (int i = 0; i < n; i++) {
            // Number of papers that have AT LEAST citations[i] citations
            int h = n - i; 
            
            if (citations[i] >= h) {
                return h;
            }
        }
        
        return 0;
    }
}