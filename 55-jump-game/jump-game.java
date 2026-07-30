class Solution {
    public boolean canJump(int[] nums) {
        int farthest = 0;
        
        for (int i = 0; i < nums.length; i++) {
            // If we can't even reach the current index, we're stuck!
            if (i > farthest) {
                return false;
            }
            
            // Update the furthest index we can jump to
            farthest = Math.max(farthest, i + nums[i]);
            
            // Early exit if we can already reach the end
            if (farthest >= nums.length - 1) {
                return true;
            }
        }
        
        return true;
    }
}