class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set=new HashSet<>(wordList);
        if(!set.contains(endWord))
            return 0;
        Queue<String> q=new LinkedList<>();
        q.add(beginWord);
        int ans=1;
        while(!q.isEmpty()){
            int size=q.size();
            
            while(size-- != 0){
                String word=q.poll();
                for(int j=0;j<word.length();j++){
                    if(word.equals(endWord))
                        return ans;
                    char[] arr=word.toCharArray();
                    for(char k='a';k<='z';k++){
                        arr[j]=k;
                        String str=new String(arr);
                        if(set.contains(str)){
                            q.add(str);
                            set.remove(str);
                        }
                    }
                }
                
            }
            ans++;
        }
        return 0;
    }
}