class Solution {
    public int nthUglyNumber(int n) {
        List <Integer> ans=new ArrayList<>();
        int ptr2=0,ptr3=0,ptr5=0;
        ans.add(1);
        for(int i=1;i<n;i++){
            int cand2=ans.get(ptr2)*2;
            int cand3=ans.get(ptr3)*3;
            int cand5=ans.get(ptr5)*5;
            
            int min_cand=Math.min(cand2,Math.min(cand3,cand5));
            ans.add(min_cand);
            if(min_cand==cand2)ptr2++;
            if(min_cand==cand3)ptr3++;
            if(min_cand==cand5)ptr5++;
        }
        return ans.getLast();
    }
}