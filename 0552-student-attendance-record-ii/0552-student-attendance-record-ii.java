class Solution {
    
    public int checkRecord(int n) {
       int m = 1000000007;
        
        long dp[][][]=new long[100001][2][3];
        
        //base case n==0
        //dp[0][a][l]=?
        for(int a=0;a<=1;a++){
                for(int l=0;l<=2;l++){
                    dp[0][a][l]=1;
                }
            }
        
        for(int i=1;i<=n;i++){
            for(int a=0;a<=1;a++){
                for(int l=0;l<=2;l++){
                    long result =dp[i-1][a][0];//present
                    result+=(a+1<=1 ? dp[i-1][a+1][0] : 0);//absent
                    result+=(l+1<=2 ? dp[i-1][a][l+1] : 0);//late
                    
                    dp[i][a][l]= result%m;
                }
            }
        }
        return(int) (dp[n][0][0]%m);
        // return (solve(n,0,0)%m);
    }
//     public int solve(int n,int absent,int late){
//         if(absent>1 || late > 2)//prunning
//             return 0;
//         if(n==0)
//             return 1;
        
//         int a=solve(n-1,absent+1,0)%m;//for absent
//         int l=solve(n-1,absent,late+1)%m;//for late
//         int p=solve(n-1,absent,0)%m;// for present
        
//         return ((a+l)%m+p)%m;
//     }
}