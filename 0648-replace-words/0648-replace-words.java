class Solution {
    public String findRoot(String word,Set<String> set){
        
        for(int l=1;l<word.length();l++){
            String root=word.substring(0,l);
            if(set.contains(root))
                return root;
        }
        
        return word;
    }
    
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> set=new HashSet<>(dictionary);
        String words[]=sentence.split(" ");
        
        StringBuilder result=new StringBuilder();
        
        for(String word:words){
            result.append(findRoot(word,set)).append(" ");    
        }
        return result.toString().trim();
    }
    
}