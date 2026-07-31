class Solution {
    public int jump(int[] nums) {
        // If the array has only 1 element, you're already at the end. 0 jumps needed.
        if (nums.length <= 1) return 0;

        int jumps = 0;
        int current_end = 0;
        int farthest = 0;

        // We loop up to nums.length - 1 because once we reach or pass the last index, 
        // we don't need to trigger another jump.
        for (int i = 0; i < nums.length - 1; i++) {
            // Track the maximum distance reachable from the current position
            farthest = Math.max(farthest, i + nums[i]);

            // If we have reached the end of the current jump's range
            if (i == current_end) {
                jumps++;                 // We must jump!
                current_end = farthest;  // Our new horizon expands to the farthest reachable spot
                
                // Early exit: if we can already reach the last index, stop looping
                if (current_end >= nums.length - 1) {
                    break;
                }
            }
        }

        return jumps;
    }
}