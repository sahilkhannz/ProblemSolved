class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int maxLocal[][]=new int[n-2][n-2];
        for(int i=0;i<n-2;i++){
            for(int j=0;j<n-2;j++){
                maxLocal[i][j]=findMax(grid,i,j);
            }
        }
        return maxLocal;
    }
    public int findMax(int [][]grid,int row,int col){
        int max=0;
        for(int i=row;i<row+3;i++){
            for(int j=col;j<col+3;j++){
                max=Math.max(max,grid[i][j]);
            }
        }
    return max;
    }
    
}