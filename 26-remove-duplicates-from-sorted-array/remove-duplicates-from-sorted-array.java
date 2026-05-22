class Solution {
    public int removeDuplicates(int[] nums) {
    

    int i = 0;

    for ( int j =1; j<nums.length; j ++){
        if(nums[j] != nums[i]){ // is j equal to i
            i++;
            nums[i] = nums[j]; // puting i in place of j
        }
    }
    return i+1;
    }
}