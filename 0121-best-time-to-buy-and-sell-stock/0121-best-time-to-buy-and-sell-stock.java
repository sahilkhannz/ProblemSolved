class Solution {
    public int maxProfit(int[] prices) {
        int lowestPrice=Integer.MAX_VALUE,profitToday=0,overAllP=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<lowestPrice)
                lowestPrice=prices[i];
            
            profitToday=prices[i]-lowestPrice;//if sell it today so how much profit we can get
            
            if(overAllP<profitToday)
                overAllP=profitToday;//maximum profit we get
            
        }
            
        return overAllP;
    }
}