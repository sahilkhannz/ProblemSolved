class Solution {
    public void solveSudoku(char[][] board) {
        helper(board,0,0);
    }
    public boolean helper(char [][]board,int row,int col){
        if(col==board.length){
            col=0;
            row++;
        }
        if(row==board.length)return true;
        if(board[row][col]=='.'){
            for(char i='1';i<='9';i++){
                if(isSafe(board,row,col,i)){
                    board[row][col]=i;
                    if(helper(board,row,col+1))return true;
                    board[row][col]='.';
                }
            }
            return false;
    }
        return helper(board,row,col+1);
    }
    public boolean isSafe(char [][]board,int row,int col,char num){
        //check column
        for(int c=0;c<9;c++)   
            if(board[row][c]==num)return false;
        //checking row
        for(int r=0;r<9;r++)
            if(board[r][col]==num)return false;
        int r=(row/3)*3;
        int c=(col/3)*3;
        for(int i=0;i<3;i++)
                for(int j=0;j<3;j++)
                        if(board[r+i][c+j]==num)return false;
        return true;
        
    }
}