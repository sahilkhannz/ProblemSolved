class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        
        for(int i=0;i<prerequisites.length;i++){
            int u=prerequisites[i][0];
            int v=prerequisites[i][1];
            
            graph.get(v).add(u);
        }
        int indegree[]=new int[numCourses];
        
        for(int i=0;i<numCourses;i++){
            for(int it:graph.get(i)){
                indegree[it]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0)
                q.add(i);
        }
        int count=0;
        
        while(!q.isEmpty()){
            int node=q.poll();
            count++;
            for(int it:graph.get(node)){
                indegree[it]--;
                if(indegree[it]==0)
                    q.add(it);
            }
        }
    if(count==numCourses)
        return true;
    return false;
    }
    
}