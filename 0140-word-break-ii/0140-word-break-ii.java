class Solution {
    
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> ans=new ArrayList<String>();
        Set<String> hs=new HashSet<String>(wordDict);
        
        solve(s,"",hs,0,ans);
        
        return ans;
        
    }
    public List<String> solve(String s,String currWord,Set<String> wordDict,int start,List<String> ans){
        if(start>=s.length()){
            ans.add(currWord);
            return ans;
        }
        
//         for(int i=start;i<s.length();i++){
//             String tempWord=s.substring(start,i);
            
//             if(wordDict.contains(tempWord)){//valid word
//                 if(!currWord.isEmpty())
//                     currWord+=" ";
                
//                 //make copy to undo operation
//                 String tempSentenc=currWord;
//                 currWord+=tempWord;//take
                
//                 solve(s,currWord,wordDict,i+1);//explore
            
//                 currWord=tempWord;// undo
                
//             }
//         }
         for (int i = start; i < s.length(); i++) {
            String tempWord = s.substring(start, i + 1);
            
            if (wordDict.contains(tempWord)) { // valid word
                String newCurrWord = currWord.isEmpty() ? tempWord : currWord + " " + tempWord;
                
                solve(s, newCurrWord, wordDict, i + 1,ans); // explore
            }
        }
        return ans;
    }
}