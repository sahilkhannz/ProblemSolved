class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set=new HashSet<>();
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                ans+=2;
                set.remove(s.charAt(i));
            }else{
                set.add(s.charAt(i));
            }
            
        }
        if(!set.isEmpty())
            ans+=1;
        return ans;
        
    }
}