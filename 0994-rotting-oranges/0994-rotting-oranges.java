class Solution {
    public boolean safe(int x,int y,int r,int c){
        return (x>=0 && y>=0 && x<r && y<c);
    }
    public int orangesRotting(int[][] grid) {
        int freshOrange=0,minute=0,n=grid.length,m=grid[0].length;
        Queue<int []> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
                if(grid[i][j]==1)
                    freshOrange++;
                
            }
        }
        if(freshOrange==0)
            return 0;
        if(q.isEmpty())
            return -1;
        while(!q.isEmpty()){
            int size=q.size();
            while(size-- !=0){
                int cell[]=q.poll();
                int x=cell[0];
                int y=cell[1];
                if(safe(x-1,y,n,m) && grid[x-1][y]==1){
                    freshOrange--;
                    grid[x-1][y]=2;
                    q.add(new int[]{x-1,y});
                }
                if(safe(x+1,y,n,m) && grid[x+1][y]==1){
                    freshOrange--;
                    grid[x+1][y]=2;
                    q.add(new int[]{x+1,y});
                }
                if(safe(x,y+1,n,m) && grid[x][y+1]==1){
                    freshOrange--;
                    grid[x][y+1]=2;
                    q.add(new int[]{x,y+1});
                }
                if(safe(x,y-1,n,m) && grid[x][y-1]==1){
                    freshOrange--;
                    grid[x][y-1]=2;
                    q.add(new int[]{x,y-1});
                }
            }
            minute++;
        }
        if(freshOrange==0)
            return minute-1;
        return -1;
    }
}