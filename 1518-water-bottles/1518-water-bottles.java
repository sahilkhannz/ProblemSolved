class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int empty=0,sum=numBottles;
        while(numBottles>=numExchange){
            int q=numBottles/numExchange;
            int r=numBottles%numExchange;
            sum+=q;
            numBottles=q+r;
        }
        return sum;
    }
}