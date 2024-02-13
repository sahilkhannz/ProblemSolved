class Solution {
    int count=0;
    public int totalNQueens(int n) {
        boolean board[][]=new boolean[n][n];
        helper(board,0); 
        return count;
    }
    public void helper(boolean [][]board,int row){
        if(row==board.length){
            count++;
            return;
        }
        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col]=true;
                helper(board,row+1);
                board[row][col]=false;
            }
        }
        
    }
    public boolean isSafe(boolean [][]board,int row,int col){
        //for column
        int r=row,c=col;
        while(r>=0){
            if(board[r][col]==true)return false;
            r--;
        }
        r=row;
        //negative Diagonal
        while(r>=0 && c>=0){
            if(board[r][c]==true)return false;
            c--;
            r--;
        }
        r=row;
        c=col;
        //positive column
        while(r>=0 && c<board.length){
            if(board[r][c]==true)return false;
            r--;
            c++;
        }
            
         return true;   
            
    }
}