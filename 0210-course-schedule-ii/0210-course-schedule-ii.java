class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int []topo=new int[numCourses];
        int []indegree=new int[numCourses];
        
        //convert in graph
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            
            int u=prerequisites[i][0];
            int v=prerequisites[i][1];
            
            graph.get(v).add(u);
        }
        for(int i=0;i<numCourses;i++){
            for(int it:graph.get(i))
                indegree[it]++;
        }
        
        Queue<Integer> q=new LinkedList<>();
        // adding those element whose indegree is 0(zero)
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0)
                q.add(i);
        }
        int idx=0;
        //handle edge case
        if(q.isEmpty())
            return new int[0];
        
        while(!q.isEmpty()){
            int x=q.poll();
            topo[idx++]=x;
            for(int i:graph.get(x)){
                indegree[i]--;
                if(indegree[i]==0){
                    q.add(i);
                }
            }
        }
        if(idx!=numCourses)
            return new int[0];
        
        return topo;
        
    }
}