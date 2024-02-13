class Solution {
    List<String> ans;
    public List<String> generateParenthesis(int n) {
        ans=new ArrayList<>();
        helper(n,0,0,"");
        return ans;        
    }
    public void helper(int n,int l, int r,String s){
        if(s.length()==n*2){
            ans.add(s);
            return;
        }
        if(l<n)
            helper(n,l+1,r,s+"(");
        if(r<l)
            helper(n,l,r+1,s+")");
        
    }
}