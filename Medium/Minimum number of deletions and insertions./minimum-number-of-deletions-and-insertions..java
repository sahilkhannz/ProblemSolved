//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s1 = sc.next();
                    String s2 = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.minOperations(s1,s2));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int lcs(String x,String y,int m,int n){
        int dp[][]=new int[m+1][n+1];
        
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0 || j==0)
                    dp[i][j]=0;
                else if(x.charAt(i-1)==y.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1]+1;
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[m][n];
    }
	public int minOperations(String str1, String str2) 
	{ 
	    // Your code goes here
	    int m=str1.length(),n=str2.length();
	    int lcs=lcs(str1,str2,m,n);
	    int insertion=n-lcs;
	    int deletion=m-lcs;
	    return insertion + deletion;
	} 
}