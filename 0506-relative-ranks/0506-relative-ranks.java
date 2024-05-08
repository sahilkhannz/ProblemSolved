class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Pair<Integer,Integer>> maxHeap=new PriorityQueue<>(
        (a, b) -> b.getKey() - a.getKey() 
        );
        int place=1,n=score.length;
        for(int i=0;i<n;i++){
            maxHeap.add(new Pair(score[i],i));
        }
        String[] ans=new String[n];
        while(!maxHeap.isEmpty()){
            Pair<Integer,Integer> pair=maxHeap.poll();
            int index=pair.getValue();
            if(place==1)
                ans[index]="Gold Medal";
            else if(place==2)
                ans[index]="Silver Medal";
            else if(place==3)
                ans[index]="Bronze Medal";
            else
                ans[index]=""+place;
            place++;
        }
        
        
        return ans;
    }
}