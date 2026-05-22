class Solution {
    public int maxArea(int[] height) {
    
    int left = 0;
    int right = height.length - 1;
    int MaxArea = 0;

    while(left < right){
        int width = right - left;
        int h = Math.min(height[left], height[right]); // here don't take height {take h} becoz height is alredy used 
        int area = h * width;
        MaxArea = Math.max(area, MaxArea);
    
    
    if(height[left] < height[right]){
        left ++;
    }
    else{ 
        right --;
    }
    }
    return MaxArea;
}
}

