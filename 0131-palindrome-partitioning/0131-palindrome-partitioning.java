class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        
        backtrack(ans,new ArrayList<>(),s,0);
        
        return ans;
    }
    public boolean isPalindrome(String s,int start,int end){
        
        while(start<end){
            if(s.charAt(start++)!=s.charAt(end--))
                return false;
        }
        return true;
    }
    public void backtrack(List<List<String>> ans,List<String> temp,String s,int start){
        if(start==s.length()){
            ans.add(new ArrayList<>(temp));
            return;
        }else{
            for(int i=start;i<s.length();i++){
                if(isPalindrome(s,start,i)){
                    temp.add(s.substring(start,i+1));
                    backtrack(ans,temp,s,i+1);
                    temp.removeLast();
                }
            }
        }
    }
}