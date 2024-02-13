class Solution {
    List<List<String>> ans;
    public List<List<String>> solveNQueens(int n) {
        ans=new ArrayList<>();
        boolean board[][]=new boolean[n][n];
        helper(board,0); 
        return ans;
    }
    public void helper(boolean [][]board,int row){
        if(row==board.length){
            addAns(board);
            return;
        }
        for(int c=0;c<board.length;c++){
            if(isSafe(board,row,c)){
                board[row][c]=true;
                helper(board,row+1);
                board[row][c]=false;
            }
        }
    }
    public boolean isSafe(boolean [][]board,int row,int col){
        //for column
        for(int r=row-1;r>=0;r--)
            if(board[r][col]==true)return false;
        //for negative diagonal
        int ndr=row,ndc=col;
        while(ndr>=0 &&ndc>=0){
            if(board[ndr][ndc]==true)return false;
            ndr--;
            ndc--;
        }
        //for positive
        int pdr=row,pdc=col;
        while(pdr>=0 && pdc<board.length){
            if(board[pdr][pdc]==true)return false;
            pdr--;
            pdc++;
        }
            
         return true;   
            
    }
    public void addAns(boolean [][]board){
        List<String> temp=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String s="";
            for(int j=0;j<board.length;j++){
                if(board[i][j]==true) s+="Q";
                else
                        s+=".";
            }
            temp.add(s);
        }
        ans.add(new ArrayList<>(temp));
    }
}