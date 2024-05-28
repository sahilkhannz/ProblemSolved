class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean visited[]=new boolean[n];
        
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        visited[0]=true;
        int ib=1;
        
        while(!q.isEmpty()){
            int x=q.poll();
            for(int i:rooms.get(x)){
                if(visited[i]==false){
                    visited[i]=true;
                    q.add(i);
                }
            }
        }
        
        for(boolean i: visited){
            if(i==false)
                return false;
        }
        return true;
        
    }
}