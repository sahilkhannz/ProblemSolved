class Solution {
    public boolean safe(int x,int y,int r,int c){
        return (x>=0 && y>=0 && x<r && y<c);
    }
    public int orangesRotting(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        Queue<int []> q=new LinkedList<>();
        int freshOrange=0,minute=0;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
                if(grid[i][j]==1){
                    freshOrange++;
                }
            }
        }
        if(freshOrange==0)
            return 0;
        if(q.isEmpty())
            return -1;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int cell[]=q.poll();
                int x=cell[0];
                int y=cell[1];
                
                if(safe(x-1,y,m,n) && grid[x-1][y]==1){
                    grid[x-1][y]=2;
                    freshOrange--;
                    q.add(new int[]{x-1,y});
                }
                if(safe(x+1,y,m,n) && grid[x+1][y]==1){
                    grid[x+1][y]=2;
                    freshOrange--;
                    q.add(new int[]{x+1,y});
                }
                if(safe(x,y-1,m,n) && grid[x][y-1]==1){
                    grid[x][y-1]=2;
                    freshOrange--;
                    q.add(new int[]{x,y-1});
                }
                if(safe(x,y+1,m,n) && grid[x][y+1]==1){
                    grid[x][y+1]=2;
                    freshOrange--;
                    q.add(new int[]{x,y+1});
                }
            }
            minute++;
        }
        if(freshOrange==0){
            return minute-1;
        }
        return -1;
        
    }
}