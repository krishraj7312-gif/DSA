class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int i = 0; // Slow pointer for unique elements

        for (int j = 1; j < nums.length; j++) { // Fast pointer scanning the array
            if (nums[j] != nums[i]) {
                i++;             // Move to the next position for a new unique element
                nums[i] = nums[j]; // Copy the unique element over
            }
        }
        
        return i + 1; // Number of unique elements
    }
}