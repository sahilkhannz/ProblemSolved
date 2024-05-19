class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        long count=0L,sum=0L,minDiff=Long.MAX_VALUE;
        for(int i:nums){
            if((i^k)>i){
                sum+=i^k;
                minDiff=Math.min(minDiff,(long)(i^k)-i);
                count++;
            }else{
                sum+=i;
                minDiff=Math.min(minDiff,(long)i-(i^k));
            }
        }
        if(count%2==0)
            return sum;
        return sum-minDiff;
        
    }
}