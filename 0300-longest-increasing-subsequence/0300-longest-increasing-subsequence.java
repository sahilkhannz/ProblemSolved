class Solution {
    public int lengthOfLIS(int[] nums) {
        int ans=1,n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,1);
        for(int i=1;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(nums[j]<nums[i]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                    ans=Math.max(ans,dp[i]);
                }
            }
        }
        return ans;
    }
}