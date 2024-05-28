class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int maxLength=0;
        int currCost=0;
        int start=0;
        for(int end=0;end<s.length();end++){
            currCost+=Math.abs(s.charAt(end)-t.charAt(end));
            
            while(currCost>maxCost){
                currCost-=Math.abs(s.charAt(start)-t.charAt(start));
                start++;
            }
            maxLength=Math.max(maxLength,end-start+1);
        }
        return maxLength;
    }
}