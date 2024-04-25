class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start=0,avail=0,total=0;
        int n=cost.length;
        for(int i=0;i<n;i++){
            total=total+gas[i]-cost[i];
            avail=avail+gas[i]-cost[i];
            if(avail<0){
                avail=0;
                start=i+1;
            }
        }
        if(total<0)
            return -1;
        return start;
        
    }
}