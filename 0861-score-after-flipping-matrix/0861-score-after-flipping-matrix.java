class Solution {
    public int matrixScore(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        
        for(int i=0;i<n;i++){
            if(grid[i][0]==0){
                for(int j=0;j<m;j++){
                    //flip row if column have 0 in first(MSP) using xor
                    grid[i][j]^=1;
                }
            }
        }
        
        for(int j=1;j<m;j++){
            int columncount=0;
            for(int i=0;i<n;i++){
                columncount+=grid[i][j];
            }
            if(columncount<n-columncount){
                for(int i=0;i<n;i++){
                    //flip row if column have 0 in first(MSP) using xor
                    grid[i][j]^=1;
                }
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                //checking each and every cell contribution
                //for 1's = 1*2^m-1-j(here j is showing contibution for each cell)
                ans+=grid[i][j]*(1<<(m-1-j));
            }
        }
        
        return ans;        
    }
}