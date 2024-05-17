class Solution {
    public void dfs(int [][]grid,int i,int j,int color,int previous){
        if(i<0 || j<0 ||i>=grid.length || j>=grid[0].length || grid[i][j]!=previous)
            return;
        grid[i][j]=color;
        dfs(grid,i-1,j,color,previous);
        dfs(grid,i+1,j,color,previous);
        dfs(grid,i,j-1,color,previous);
        dfs(grid,i,j+1,color,previous);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int previous = image[sr][sc];
        if(previous!=color)
            dfs(image,sr,sc,color,previous);
        return image;
    }
}