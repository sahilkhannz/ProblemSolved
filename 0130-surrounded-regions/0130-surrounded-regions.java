class Solution {
    public boolean isSafe(int i,int j,int n,int m){
        if(i<0 || j<0 || i>=n || j>=m )
            return false;
        return true;
    }
    
    public void dfs(char[][]board,int i,int j,int n,int m){
        if(i<0 || j<0 || i>=n || j>=m || board[i][j]!='O')
            return;
         board[i][j]='#';
         dfs(board,i-1,j,n,m);
         dfs(board,i+1,j,n,m);
         dfs(board,i,j-1,n,m);
         dfs(board,i,j+1,n,m);
            
    }
    public void solve(char[][] board) {
        int n=board.length,m=board[0].length;
        Queue<int[]>q=new LinkedList<>();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if((i==0 || j==0) && board[i][j]=='O'){
                    q.add(new int[]{i,j});
                    board[i][j]='#';
                }
                if((i== n-1|| j==m-1) && board[i][j]=='O'){
                    q.add(new int[]{i,j});
                    board[i][j]='#';
                }
            }
        }
        while(!q.isEmpty()){
            int size=q.size();
            while(size-- != 0){
                int []cell=q.poll();
                int x=cell[0];
                int y=cell[1];
                if(isSafe(x-1,y,n,m) && board[x-1][y]=='O'){
                    q.add(new int[]{x-1,y});
                    board[x-1][y]='#';
                }
                if(isSafe(x+1,y,n,m) && board[x+1][y]=='O'){
                    q.add(new int[]{x+1,y});
                    board[x+1][y]='#';
                }
                if(isSafe(x,y-1,n,m) && board[x][y-1]=='O'){
                    q.add(new int[]{x,y-1});
                    board[x][y-1]='#';
                }
                if(isSafe(x,y+1,n,m) && board[x][y+1]=='O'){
                    q.add(new int[]{x,y+1});
                    board[x][y+1]='#';
                }
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='O')
                    board[i][j]='X';
                if(board[i][j]=='#')
                    board[i][j]='O';
                
                    
            }
        }
        
    }
}