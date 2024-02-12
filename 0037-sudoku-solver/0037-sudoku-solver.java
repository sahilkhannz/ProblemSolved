class Solution {
    public void solveSudoku(char[][] board) {
        helper(board,0,0);   
    }
    public boolean helper(char[][]board,int row,int col){
        if(col==board.length){
            col=0;
            row++;
        }
        if(row==board.length)return true;
        if(board[row][col]=='.'){
            for(char num='1';num<='9';num++){
                if(isValid(board,row,col,num)){
                    board[row][col]=num;
                    if(helper(board,row,col+1))return true;
                    board[row][col]='.';
                }
            }
            return false;
            
        }
        return helper(board,row,col+1);
        
    }
    public boolean isValid(char[][]board,int row,int col,char num){
        //check column
        for(int c=0;c<9;c++)
            if(board[row][c]==num)return false;
        //check row 
        for(int r=0;r<9;r++)
            if(board[r][col]==num)return false;
        //check grid
        int startr=(row/3)*3;
        int startc=(col/3)*3;
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                if(board[startr+i][startc+j]==num)return false;
        return true;
    }
  
}