class Solution {
    public String reversePrefix(String word, char ch) {
        int s=0,e=0,n=word.length();
        String ans="";
        for(int i=0;i<n;i++){
            if(word.charAt(i)==ch){
                e=i;
                break;
            }
        }
        for(int i=0;i<=e;i++){
            char temp=word.charAt(i);
            ans=temp+ans;
        }
        ans=ans+word.substring(e+1,n);
        return ans;
    }
}