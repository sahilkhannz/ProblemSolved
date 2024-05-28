class Solution {
    public boolean isAtExtreme(int i, int j, int r, int c) {
        return i == 0 || j == 0 || i == r - 1 || j == c - 1;
    }
    public void dfs(int[][] grid,int i,int j,int n,int m){
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j] != 1)
            return;
        grid[i][j]=0;
        
        dfs(grid,i+1,j,n,m);
        dfs(grid,i-1,j,n,m);
        dfs(grid,i,j+1,n,m);
        dfs(grid,i,j-1,n,m);
    }
    public int numEnclaves(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               if(grid[i][j]==1 && isAtExtreme(i,j,n,m)){
                   dfs(grid,i,j,n,m);
               }
           }
        }
        int ans=0;
        for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               if(grid[i][j]==1)
                   ans++;
           }
        }
        return ans;
    }
}