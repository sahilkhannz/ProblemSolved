class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        List<Pair <Double,Integer>> paid=new ArrayList<>();
        for(int i=0;i<quality.length;i++){
            paid.add(new Pair<>((double)wage[i]/quality[i],quality[i]));
        }
        Collections.sort(paid,Comparator.comparingDouble(a -> a.getKey()));
        double ans=Double.MAX_VALUE,qualitysum=0.0;
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder()); 
        
        for(int i=0;i<paid.size();i++){
            double ratio=paid.get(i).getKey();
            qualitysum+=paid.get(i).getValue();
            maxHeap.offer(paid.get(i).getValue());
            if(k<maxHeap.size()){
                qualitysum-=maxHeap.poll();
            }if(k==maxHeap.size()){
                ans=Math.min(ans,qualitysum*ratio);
            }
            
            
        }
        return ans;
    }
}