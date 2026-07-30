class Solution {
    public void rotate(int[] nums, int k) {
        // Edge case: If array is null or empty, nothing to rotate
        if (nums == null || nums.length <= 1) {
            return;
        }
        
        int n = nums.length;
        
        // Handle cases where k is greater than or equal to n
        k = k % n; 
        
        // If k is 0 after the modulo, no rotation is needed
        if (k == 0) {
            return;
        }

        // Step 1: Reverse the entire array
        reverse(nums, 0, n - 1);
        
        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);
        
        // Step 3: Reverse the remaining n-k elements
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
}