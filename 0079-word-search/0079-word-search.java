class Solution {
    public boolean dfs(char [][]board,int i,int j,int index,String word,boolean [][]visited,int n,int m){
        if(index==word.length())
            return true;
        if(i<0 || j<0 || i>=n || j>=m || visited[i][j] || board[i][j]!=word.charAt(index))
            return false;
        visited[i][j]=true;
        boolean found= dfs(board,i,j+1,index+1,word,visited,n,m) || dfs(board,i-1,j,index+1,word,visited,n,m) || dfs(board,i,j-1,index+1,word,visited,n,m) || dfs(board,i+1,j,index+1,word,visited,n,m);
        
        visited[i][j]=false;
        return found;
    }
    public boolean exist(char[][] board, String word) {
        int n=board.length,m=board[0].length;
        boolean visited[][]=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0) && dfs(board,i,j,0,word,visited,n,m))
                    return true;
            }
        }
        return false;
    }
}