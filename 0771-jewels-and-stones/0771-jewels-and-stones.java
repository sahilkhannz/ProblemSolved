class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans=0;
       /* Map<Character,Integer> freq=new HashMap<>();
        for(int i=0;i<stones.length();i++){
            if(freq.containsKey(stones.charAt(i))){
                freq.put(stones.charAt(i),freq.get(stones.charAt(i))+1);
            }else
                         freq.put(stones.charAt(i),1);
        }
        for(int i=0;i<jewels.length();i++){
            if(freq.containsKey(jewels.charAt(i))){
               ans+= freq.get(jewels.charAt(i));
            }
        }*/
        for(int i=0;i<stones.length();i++){
            if(jewels.indexOf(stones.charAt(i))!=-1)ans++;
        }
    return ans;
    }
}