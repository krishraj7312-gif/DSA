class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int low = 0;
        int sum = 0;
        int res = Integer.MAX_VALUE;
       
        for ( int high = 0; high < nums.length; high ++){
            sum += nums[high]; // window bigger ho rahi hai until sum >= target
                

        while(sum >= target ){
            int len = high - low + 1;
            res = Math.min(res, len);

            sum = sum - nums[low]; // window smaller ho rahi hai
            low ++;
        }
        }
        //expand using high , & shrink using low
       
     return res == Integer.MAX_VALUE ? 0 : res;
    }
   
}