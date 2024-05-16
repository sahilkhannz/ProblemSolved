class Solution {
    public void dfs(char grid[][],int i,int j,int n,int m){
        if(i<0 || j<0 ||i>=n || j>=m || grid[i][j]=='0')
            return;
        grid[i][j]='0';
        dfs(grid,i-1,j,n,m);
        dfs(grid,i+1,j,n,m);
        dfs(grid,i,j-1,n,m);
        dfs(grid,i,j+1,n,m);
    }
    public int numIslands(char[][] grid) {
        if(grid.length==0 || grid==null)
            return 0;
        int island=0,n=grid.length,m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j,n,m);
                    island++;
                }
            }
        }
        return island;
        
    }
}