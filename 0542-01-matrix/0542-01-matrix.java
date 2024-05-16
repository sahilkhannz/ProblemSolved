class Solution {
    public boolean safe(int x,int y,int r,int c){
        return (x>=0 && y>=0 && x<r && y<c);
    }
    public int[][] updateMatrix(int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;
        
        int dis[][]=new int[row][col];
        Queue<int []> q=new LinkedList<>();
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==0){
                    dis[i][j]=0;
                    q.add(new int[]{i,j});
                }else{
                    dis[i][j]=-1;
                }
            }
        }
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int cell[]=q.poll();
                int x=cell[0];
                int y=cell[1];
                if(safe(x-1,y,row,col) && dis[x-1][y]==-1){
                    q.add(new int[]{x-1,y});
                    dis[x-1][y]=dis[x][y]+1;
                }
                if(safe(x+1,y,row,col) && dis[x+1][y]==-1){
                    q.add(new int[]{x+1,y});
                    dis[x+1][y]=dis[x][y]+1;
                }
                if(safe(x,y-1,row,col) && dis[x][y-1]==-1){
                    q.add(new int[]{x,y-1});
                    dis[x][y-1]=dis[x][y]+1;
                }
                if(safe(x,y+1,row,col) && dis[x][y+1]==-1){
                    q.add(new int[]{x,y+1});
                    dis[x][y+1]=dis[x][y]+1;
                }

            }
        }
        return dis;
    }
}