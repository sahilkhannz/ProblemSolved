class Solution {
    int ans,n;
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int freq[]=new int[26];
        for(char ch: letters)
            freq[ch-'a']++;
        ans=Integer.MIN_VALUE;
        n=words.length;
        solve(words,letters,score,freq,0,0);
        
        return ans;
    }
    public  void solve(String[] words, char[] letters,int score[], int[] freq,int idx,int currScore) {
        ans=Math.max(ans,currScore);
        if(idx>=n){
            return;
        }
        //need to take of freq array not modify for not take part
        //using clone method, if we directly store freq so it just pass refrence not copy the array
        int[] tempFreq=freq.clone();
        
        int j=0,tempScore=0;
        //check can we take it or not
        while(j<words[idx].length()){
            char c=words[idx].charAt(j);
            freq[c-'a']--;
            tempScore+=score[c-'a'];
            if(freq[c-'a']<0)
                break;
            
            j++;
        }
        // If we were able to take the entire word, explore this branch
        if(j==words[idx].length())
            solve(words,letters,score,freq,idx+1,currScore+tempScore);
        
        //not take
        solve(words,letters,score,tempFreq,idx+1,currScore);
        
    }
}