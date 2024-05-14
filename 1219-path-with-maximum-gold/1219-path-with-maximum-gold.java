class Solution {
    public int findMax(int[][] grid,int[][] visited,int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || visited[i][j]==1 || grid[i][j]==0)
            return -10;
        visited[i][j]=1;
        int a=findMax(grid,visited,i+1,j);
        if(a<0)
            a=0;
        int b=findMax(grid,visited,i-1,j);
        if(b<0)
            b=0;
        int c=findMax(grid,visited,i,j+1);
        if(c<0)
            c=0;
        int d=findMax(grid,visited,i,j-1);
        if(d<0)
            d=0;
        int max = Math.max(Math.max(a,b),Math.max(c,d));
        visited[i][j]=0;
        
        return max+grid[i][j];
    }
    public int getMaximumGold(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int ans=0;
        int [][]visited=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]!=0)
                    ans=Math.max(ans,findMax(grid,visited,i,j));
            }
        }
      return ans;  
    }
}