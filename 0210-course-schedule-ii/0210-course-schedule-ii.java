class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        
        for(int i=0;i<prerequisites.length;i++){
            int u=prerequisites[i][0];
            int v=prerequisites[i][1];
            
            graph.get(v).add(u);
        }
        int ans[]=new int[numCourses];
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
        if(q.isEmpty())
            return new int[0];
        int idx=0;
        
        while(!q.isEmpty()){
            int node=q.poll();
            ans[idx++]=node;
            for(int it:graph.get(node)){
                indegree[it]--;
                if(indegree[it]==0)
                    q.add(it);
            }
        }
        if(idx!=numCourses)
            return new int[0];
       return ans; 
    }
}