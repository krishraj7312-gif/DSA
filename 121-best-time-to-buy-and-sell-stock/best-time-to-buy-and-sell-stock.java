class Solution {
    public int maxProfit(int[] prices) {
      int MinPrice = Integer.MAX_VALUE;
      int MaxProfit =0;

      for(int price : prices){
        if(price < MinPrice){
            MinPrice = price; // buy here
        }
        else{
        int Profit = price - MinPrice;
            MaxProfit = Math.max(MaxProfit, Profit);
        }

      } 
      return MaxProfit; 
    }
}