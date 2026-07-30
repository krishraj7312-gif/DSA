import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Populate the frequency map
        for (int i = 0; i < nums.length; i++) {
            // getOrDefault returns the current count, or 0 if it's the first time seeing it
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Find the element with a frequency > n / 2
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }
        }
        
        return -1; // Standard fallback if no majority element exists
    }
}