class Solution {
    public int lcs(String x,String y,int n,int m){
        int dp[][]=new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(x.charAt(i-1)==y.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1]+1;
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[n][m];
    }
    public int minDistance(String word1, String word2) {
        int n=word1.length(),m=word2.length();
        int lcs=lcs(word1,word2,n,m);     
        return n+m-2*lcs;
    }
}