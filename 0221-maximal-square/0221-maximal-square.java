class Solution {
    public int maximalSquare(char[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
        int arr[][]=new int[m][n];
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0){
                    arr[i][j]=matrix[i][j]-'0';
                }else{
                    if(matrix[i][j]=='1'){
                     arr[i][j]=Math.min(arr[i-1][j-1],Math.min(arr[i][j-1],arr[i-1][j]))+1;
                    }
                }
                ans=Math.max(ans,arr[i][j]);
            }
        }
        
        return ans*ans;
    }
}