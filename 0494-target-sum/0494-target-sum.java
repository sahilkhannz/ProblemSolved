class Solution {
    public int findTargetSumWays(int[] nums, int target) {
         int sum=0,n=nums.length;
        for(int i:nums)
            sum+=i;
        if(sum<Math.abs(target))
            return 0;
        if((sum+target)%2!=0)
            return 0;
        sum=(target+sum)/2;
        
        int dp[][]=new int[n+1][sum+1];
        //making 0 row false expext 0th column
        //making 0 column true because sum of empty array is 0
        for(int i=0;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(i==0)
                    dp[i][j]=0;
                if(j==0)
                    dp[i][j]=1;
            }
        }
        dp[0][0]=1;
        // checking it have sum or not
        for(int i=1;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(nums[i-1]<=j){
                    dp[i][j]=dp[i-1][j] + dp[i-1][j-nums[i-1]];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
        
    }
}