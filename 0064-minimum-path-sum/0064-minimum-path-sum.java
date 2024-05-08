class Solution {
    public int minPathSum(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        
        int dp[][]=new int[r][c];
        dp[r-1][c-1]=grid[r-1][c-1];
        for(int i=r-2;i>=0;i--){
            dp[i][c-1]=dp[i+1][c-1]+grid[i][c-1];
        }
        for(int i=c-2;i>=0;i--){
            dp[r-1][i]=dp[r-1][i+1]+grid[r-1][i];
        }
        for(int i=r-2;i>=0;i--){
            for(int j=c-2;j>=0;j--){
                dp[i][j]=Math.min(dp[i+1][j],dp[i][j+1])+grid[i][j];
            }
        }
        return dp[0][0];
    
    }
}