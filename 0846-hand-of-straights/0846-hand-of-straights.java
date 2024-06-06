class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n=hand.length;
        if(n%groupSize !=0)
            return false;
        
        Arrays.sort(hand);
        for(int i=0;i<n;i++){
            if(hand[i]>=0)
                if(!findSuccesor(hand,groupSize,i,n))
                    return false;
        }
        return true;
    }
    public boolean findSuccesor(int []hand,int groupSize,int i,int n){
        int fs=hand[i]+1;
        hand[i]=-1;
        int count=1;
        i=+1;
        while(i<n && count<groupSize){
            
            if(hand[i]==fs){
                fs=hand[i]+1;
                count++;
                hand[i]=-1;
            }
            i++;
        }
        if(count==groupSize)
            return true;
        return false;
        
    }
}