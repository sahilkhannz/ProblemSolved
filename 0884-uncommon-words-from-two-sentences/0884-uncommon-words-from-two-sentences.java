class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String combine= s1+" "+s2;
        Map <String,Integer> freq=new HashMap<>();
        List <String>ans=new ArrayList<>();
        for(String s:combine.split(" ")){
            if(freq.containsKey(s)){
                freq.put(s,freq.get(s)+1);
            }
            else
                freq.put(s,1);
        }
        
        for(String s:combine.split(" ")){
            if(freq.containsKey(s)){
                if(freq.get(s)==1)
                    ans.add(s);
            }
        }
        String[] arr = ans.toArray(new String[0]);
        return arr;
    }
}